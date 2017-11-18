
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;

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
            } else if(storyRecords.size()==1){
            	return storyRecords.get(0);
            }else{
            	return null;
            }
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

    // int max: max to display. 
    public JSONObject getLatest(int max) {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        String query = "select * from " + tableName + " order by datet";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            int count = 1;
            while (resultSet.next() && count <= max) {
                int ID = resultSet.getInt("ID");
                String title = resultSet.getString("title");
                int datet = resultSet.getInt("datet");
                JSONObject listMem = new JSONObject();
                listMem.put("ID", ID);
                listMem.put("title", title);
                listMem.put("datet", datet);
                jsonArray.put(listMem);
                count++;
            }
            return jsonObject.put("list", jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public JSONObject getLastestWithCon(int max, int age, int stage) {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        // Select age range from (age -4) to ( age + 4) and show the current the stage and the next stage.
        // The patient or parents may want to know what the next stage is gonna be like.

        String query = "SELECT * FROM " + tableName + " WHERE age>= " + (age - 4) + " AND age <= " + (age + 4)
                + " AND stage<= " + (stage + 1) + " AND stage >= " + stage + " order by datet";

        try {
            ResultSet resultSet = statement.executeQuery(query);
            int count = 1;
            while (resultSet.next() && count <= max) {
                int ID = resultSet.getInt("ID");
                String title = resultSet.getString("title");
                int datet = resultSet.getInt("datet");
                JSONObject listMem = new JSONObject();
                listMem.put("ID", ID);
                listMem.put("title", title);
                listMem.put("datet", datet);
                jsonArray.put(listMem);
                count++;
            }
            return jsonObject.put("list", jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
