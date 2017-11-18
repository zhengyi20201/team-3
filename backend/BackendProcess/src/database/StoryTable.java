package database;

import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;

import database.StoryRecord;
import org.json.JSONArray;
import org.json.JSONObject;

public class StoryTable {
    private String tableName;
    private Connection connection;
    private Statement statement;


    public StoryTable(String name) {
        connection = JDBCaccess.getConnect();
        statement = JDBCaccess.getStatement();
        tableName = name;
    }

    public boolean insert(StoryRecord s) {
        String query = s.generateUpdate();
        System.out.println(query);
        try {
            statement.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public StoryRecord selectByID(int ID) {
        String query = "SELECT * FROM " + tableName;
        query += " WHERE ID = " + ID;
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(query);
            ArrayList<StoryRecord> storyRecords = StoryRecord.fromResultSet(resultSet);
            if (storyRecords.size() > 1) {
                throw new Exception("primary key is more than one");
            }
            return storyRecords.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<StoryRecord> selectStage(int stage) {
        String query = "SELECT * FROM " + tableName;
        query += " WHERE stage = " + stage;
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(query);
            ArrayList<StoryRecord> storyRecords = StoryRecord.fromResultSet(resultSet);
            return storyRecords;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        } finally {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public JSONObject getLatest(int num) {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        String query = "select * from " + tableName + " order by datet";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String title = resultSet.getString("title");
                int datet = resultSet.getInt("datet");
                JSONObject listMem = new JSONObject();
                listMem.put("ID", ID);
                listMem.put("title", title);
                listMem.put("datet", datet);
                jsonArray.put(listMem);
            }
            return jsonObject.put("list", jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
