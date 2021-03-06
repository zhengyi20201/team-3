package database;//STEP 1. Import required packages

import java.sql.*;

public final class JDBCaccess {
    // JDBC driver name and database URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //static final String DB_URL = "jdbc:mysql://34.240.123.110:3306/StoryDatabase";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";

    //  Database credentials
    private static final String USER = "root";
    //static final String PASS = "YOURNEWPASSWORD";
    private static final String PASS = "yzj1997922";

    private static Connection connection;
    private static Statement statement;

    private static void connect() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("try to connect failed");
            e.printStackTrace();
        }
    }

    public static Connection getConnect() {
        if (connection == null) {
            connect();
        }
        return connection;
    }

    public static Statement getStatement() {
        if (connection == null) {
            connect();
        }
        if (statement == null) {
            try {
                statement = connection.createStatement();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return statement;
    }

    public boolean close() {
        if (connection == null) {
            return true;
        }

        try {
            statement.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO STORY " +
                    "VALUES (101, 'Mahnaz', 11,'123','123','123',1,1,1,1,1,'123')";
            stmt.executeUpdate(sql);
            sql = "SELECT ID, age FROM STORY";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
//                int id = rs.getInt("id");
//                int age = rs.getInt("age");
//                String first = rs.getString("first");
//                String last = rs.getString("last");
//
//                //Display values
//                System.out.print("ID: " + id);
//                System.out.print(", Age: " + age);
//                System.out.print(", First: " + first);
//                System.out.println(", Last: " + last);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end FirstExample