package git;

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
			   String createStoryTable = "CREATE TABLE Story(\n title TEXT NOT NULL);";
			   
			   stmt.executeUpdate(createStoryTable);
			   
			   // Create cancer table: 
			   String createCancerTable = "CREATE TABLE Cancer(\n id TEXT NOT NULL)";
			   stmt.executeUpdate(createCancerTable);
			   
			   // Create stage table: 
			   String createStageTable = "CREATE TABLE Stage(\n name TEXT NOT NULL)";
			   stmt.executeUpdate(createStageTable);
			   
			   System.out.println("Connect success");

			   
			   
			   
		   }catch (Exception e) {
			// TODO: handle exception
			   System.err.print(e);
		   }
	   }
	   
	   public boolean addStory() {
		   return false;
		   
	   }
	   
	   public boolean addCancer() {
		   return false;
	   }
	   
	   public boolean addStage() {
		   return false;
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
				   
			   }
		   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		   

		   
		   return "";
	   }
	   
	   
	   
	   
	   public static void main(String[] args) {
		   Database db = new Database();
		   
	   }
	   
	   
}
