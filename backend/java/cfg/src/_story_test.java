
import org.json.JSONObject;

import java.sql.Statement;

public class _story_test {
    public static void main(String[] args) {
        StoryTable storyTable = new StoryTable("STORY");
        StoryRecord storyRecord = new StoryRecord("Mahnaz", 1010101, 1, "123", "123", "123", 1, 1, 1, 1, 1, "123");
        storyTable.insert(storyRecord);
        StoryRecord storyRecord1 = storyTable.selectByID(2);
        System.out.println(storyRecord1.generateJSON());
        JSONObject listObj = storyTable.getLatest(3);
        System.out.println(listObj.toString());


    }
}
