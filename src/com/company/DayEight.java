package com.company;

import java.sql.*;

public class DayEight {

    public static void main(String... args){

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connection variable
            Connection conn;
            //start the connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost/scottdb","root","root");
            System.out.println(conn);
            // set query and execute
            String query = "select * from emp ";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            //print the result
            while(rs.next()){
                System.out.println(rs.getString(2)+"|"+rs.getString(1)+"|"+rs.getString(3)+"|"+rs.getString(4)+"|"+rs.getString(5));
            }
            conn.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
        /*

        *
    Queries to Create Tables  + add Data

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.sql.Statement;
    public class createTable {

	private static final String createTableSQL = "create table users (\r\n" + "  id  int(3) primary key,\r\n" +
	        "  name varchar(20),\r\n" + "  email varchar(20),\r\n" + "  country varchar(20),\r\n" +
	        "  password varchar(20)\r\n" + "  );";

	    public static void main(String[] argv) throws SQLException {
	    	createTable createTableExample = new createTable();
	        createTableExample.createTable();
	    }

	    public void createTable() throws SQLException {

	        System.out.println(createTableSQL);
	        // Step 1: Establishing a Connection
	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/example?useSSL=false", "root", "");

	            // Step 2:Create a statement using connection object
	            Statement statement = connection.createStatement();) {

	            // Step 3: Execute the query or update query
	            statement.execute(createTableSQL);
	        } catch (SQLException e) {

	            // print SQL exception information
	            printSQLException(e);
	        }

	        // Step 4: try-with-resource statement will auto close the connection.
	    }

	    public static void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
	}
        *  */
    }
}

