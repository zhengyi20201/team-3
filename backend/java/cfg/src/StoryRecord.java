

import org.json.simple.parser.JSONParser;
import org.json.JSONObject;

import java.sql.ResultSet;
import java.util.ArrayList;


public class StoryRecord {
    private int ID;
    private String title;
    private int datet;
    private int age;
    private String photo;
    private String video;
    private String story;
    private int cancerID;
    private int category1;
    private int category2;
    private int category3;
    private int stage;
    private String email;

    public StoryRecord(String t, int d, int a, String p, String v, String s, int c, int c1, int c2, int c3, int st, String e) {
        //ID = i;
        title = t;
        datet = d;
        age = a;
        photo = p;
        video = v;
        story = s;
        cancerID = c;
        category1 = c1;
        category2 = c2;
        category3 = c3;
        stage = st;
        email = e;
    }

    public StoryRecord(int i, String t, int d, int a, String p, String v, String s, int c, int c1, int c2, int c3, int st, String e) {
        ID = i;
        title = t;
        datet = d;
        age = a;
        photo = p;
        video = v;
        story = s;
        cancerID = c;
        category1 = c1;
        category2 = c2;
        category3 = c3;
        stage = st;
        email = e;
    }


    public String generateUpdate() {
        String query = "INSERT INTO STORY (title,datet,age,photo,video,story,cancerID,category1,category2,category3,stage,email) VALUES ( ";
        //query += ID + ",";
        query += "'" + title + "'" + ",";
        query += age + ",";
        query += datet + ",";
        query += "'" + photo + "'" + ",";
        query += "'" + video + "'" + ",";
        query += "'" + story + "'" + ",";
        query += cancerID + ",";
        query += category1 + ",";
        query += category2 + ",";
        query += category3 + ",";
        query += stage + ",";
        query += "'" + email + "'" + " );";
        return query;
    }

    public static ArrayList<StoryRecord> fromResultSet(ResultSet resultSet) {
        ArrayList<StoryRecord> storyRecords = new ArrayList<>();
        try {
            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String title = resultSet.getString("title");
                int datet = resultSet.getInt("datet");
                int age = resultSet.getInt("age");
                String photo = resultSet.getString("photo");
                String video = resultSet.getString("video");
                String story = resultSet.getString("story");
                int cancerID = resultSet.getInt("cancerID");
                int category1 = resultSet.getInt("category1");
                int category2 = resultSet.getInt("category1");
                int category3 = resultSet.getInt("category1");
                int stage = resultSet.getInt("stage");
                String email = resultSet.getString("email");
                storyRecords.add(new StoryRecord(title, datet, age, photo, video, story, cancerID, category1, category2, category3, stage, email));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return storyRecords;
    }

    public JSONObject generateJSON() {
        try {
            JSONObject obj = new JSONObject();
            obj.put("ID", ID);
            obj.put("title", title);
            obj.put("datat", datet);
            obj.put("age", age);
            obj.put("photo", photo);
            obj.put("video", video);
            obj.put("story", story);
            obj.put("cancerID", cancerID);
            obj.put("category1", category1);
            obj.put("category2", category2);
            obj.put("category3", category3);
            obj.put("category3", category3);
            obj.put("stage", stage);
            obj.put("email", email);
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public StoryRecord(String jsonString) {
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonString);
            int ID = jsonObject.getInt("ID");
            String title = jsonObject.getString("title");
            int datet = jsonObject.getInt("datet");
            int age = jsonObject.getInt("age");
            String photo = jsonObject.getString("photo");
            String video = jsonObject.getString("video");
            String story = jsonObject.getString("story");
            int cancerID = jsonObject.getInt("cancerID");
            int category1 = jsonObject.getInt("category1");
            int category2 = jsonObject.getInt("category1");
            int category3 = jsonObject.getInt("category1");
            int stage = jsonObject.getInt("stage");
            String email = jsonObject.getString("email");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static StoryRecord generateRandomRecord() {
        //TODO: do
        return null;
    }

}
