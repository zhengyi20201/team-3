
import java.sql.*;


public class Database {
	
	   // JDBC driver name and database URL
	   // Set up the database before running. Just set up a empty one.
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/test";
	   
	   
	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "a1997618";
	   
	   Connection connection = null;
	   Statement stmt = null;
	   


	   public Database() {
		   try {
			   Class.forName(JDBC_DRIVER);

			   connection = DriverManager.getConnection(DB_URL, USER, PASS);
			   
			   stmt = connection.createStatement();
			   
			   // Story table : 
			   // Change this later. 
			   String createStoryTable = 
					   "CREATE TABLE STORY(\r\n" + 
			   		"  ID INT NOT NULL AUTO_INCREMENT,\r\n" + 
			   		"  title TEXT NOT NULL,\r\n" + 
			   		"  age INT,\r\n" + 
			   		"  photo TEXT,\r\n" + 
			   		"  video TEXT,\r\n" + 
			   		"  story TEXT NOT NULL,\r\n" + 
			   		"  cancerID INT,\r\n" + 
			   		"  category1 INT NOT NULL,\r\n" + 
			   		"  category2 INT,\r\n" + 
			   		"  category3 INT,\r\n" + 
			   		"  stage INT,\r\n" + 
			   		"  email TEXT,\r\n" + 
			   		"  PRIMARY KEY ( ID )\r\n" + 
			   		");";
			   
			   stmt.executeUpdate(createStoryTable);
			   
			   // Create cancer table: 
			   String createCancerTable = 
					   "CREATE TABLE CANCER(\r\n" + 
			   		"  ID INT NOT NULL AUTO_INCREMENT,\r\n" + 
			   		"  description TEXT NOT NULL,\r\n" + 
			   		"  PRIMARY KEY ( ID )\r\n" + 
			   		");";
			   stmt.executeUpdate(createCancerTable);
			   
			   // Create stage table: 
			   String createStageTable = 
					   "CREATE TABLE STAGE(\r\n" + 
			   		"  ID INT NOT NULL AUTO_INCREMENT,\r\n" + 
			   		"  description TEXT NOT NULL,\r\n" + 
			   		"  PRIMARY KEY ( ID )\r\n" + 
			   		");";
			   stmt.executeUpdate(createStageTable);
			   
			   System.out.println("Connect success");

			   
			   
			   
		   }catch (Exception e) {
			// TODO: handle exception
			   System.err.print(e);
		   }
	   }
	   
	   public boolean addStory() {
		   
		   //String insert = "INSERT " 
		   
		   return false;
		   
	   }
	   
	   public boolean addCancer(String descr) {
		   try {
			   stmt.executeUpdate("INSERT INTO cancer (description) VALUES (\""+ descr + "\");\r\n");
			   return true;
		   }catch (Exception e) {
			// TODO: handle exception
			   return false;
		   }
	   }
	   
	   public boolean addStage(String descr) {
		   try {
			   stmt.executeUpdate("INSERT INTO stage (description) VALUES (\""+ descr + "\");\r\n");
			   return true;
		   }catch (Exception e) {
			// TODO: handle exception
			   return false;
		   }
		   
	   }
	   
	   public boolean dropStory() {
		   return false;
	   }
	   
	   public boolean dropCancer() {
		   return false;
	   }
	   
	   public boolean dropStage() {
		   return false;
	   }
	   
	   public String query() {
		   
		   String query = " SELECT...";
		   
		   try {
			   ResultSet rs = stmt.executeQuery(query);
			   while(rs.next()) {
				   int id = rs.getInt("");
				   
			   }
			   rs.close();
		   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		   

		   
		   return "";
	   }
	   
	   public void exit() {
		   try {
			   stmt.close();
			   connection.close();
		   }
		   catch (Exception e) {
			// TODO: handle exception
		   System.err.print(e);
		}
	   }
	   
	   
	   public static void main(String[] args) {
		   Database db = new Database();
		   
	   }
	   
	   
}
