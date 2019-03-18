package com.revature.JDBCDemo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	// Connect to database
        String hostName = "gamedbserver.database.windows.net"; // update me
        String dbName = "MusicDb"; // update me
        String user = "alexander"; // update me
        String password = "Password1234"; // update me
        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
            
            Statement statement = connection.createStatement();
            
            String sql = "select [artistName] from Artist";
            //String sql = "insert values [artistName] from Artist";
            
            ResultSet artists = statement.executeQuery(sql);

            while (artists.next()) {
                System.out.println(artists.getString("artistName"));
            }
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
