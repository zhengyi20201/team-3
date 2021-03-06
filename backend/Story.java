import java.sql.*;
//best code ever
public class Story {
	private int id;
	private String videoURL;
	private String caption;
	private String imageURL;
	private int age;
	private int cancer;
	private Timestamp time;
	private int catergory;
	private int stage;
	private String email;
	
	public Story() {}
	
	public Story(int id, int age, String e, String v, String c, String i, int cat, int st, Timestamp t, int can) {
		this.id = id;
		this.age = age;
		this.email = e;
		this.videoURL = v;
		this.caption = c;
		this.imageURL = i;
		this.time = t;
		this.catergory = cat;
		this.cancer = can;
		this.stage = st;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getCaption() {
		return this.caption;
	}
	
	public String getVideoURL() {
		return this.videoURL;
	}
	
	public String getImageURL() {
		return this.imageURL;
	}
	
	public int getCancerId() {
		return this.cancer;
	}
	
	public int getCatergoryId() {
		return this.catergory;
	}
	
	public int getStageId() {
		return this.stage;
	}
	
	public Timestamp getTime() {
		return this.time;
	}
	
	public int setEmail(String e) {
		if (e == null)
			return -1;
		this.email = e;
		return 0;
	}
	
	public int setImage(String i) {
		if (i == null)
			return -1;
		this.imageURL  = i;
		return 0;
	}
	
	public int setVideo(String v) {
		if (v == null)
			return -1;
		this.videoURL = v;
		return 0;
	}
	
	public int setCaption(String t) {
		if (t == null)
			return -1;
		this.caption = t;
		return 0;
	}
	
	public int setTime(Timestamp t) {
		if (t == null)
			return -1;
		this.time = t;
		return 0;
	}
	
	public void setStage(int t) {
		this.stage = t;
	}
	
	public void setCatergory(int t) {
		this.catergory = t;
	}
	
	public void setCancer(int t) {
		this.cancer = t;
	}
	
	public void setAge(int t) {
		this.age = t;
	}
}
