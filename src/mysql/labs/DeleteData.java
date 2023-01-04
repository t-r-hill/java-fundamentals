package mysql.labs;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.*;

public class DeleteData extends SqlConnection{

    String db;
    String connectionString;
    Connection connection;
    PreparedStatement preparedStatement;

    DeleteData(String db) {
        this.db = "air_travel";

        try {
            connectionString = "jdbc:mysql://localhost/" + db
                    + "?user=" + user + "&password=" + URLEncoder.encode(pass, "UTF-8")
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Exception occurred - driver not found on classpath");
//            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            System.out.println("Password could not be encoded");
            e.printStackTrace();
        }
    }

    public void deleteFlight(int id) {
        connection = null;
        preparedStatement = null;

        try {
            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement("DELETE " +
                    "FROM flights " +
                    "WHERE id = ?;");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("SQL exception occurred");
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Exception occurred - couldn't close connection");
                e.printStackTrace();
            }
        }
    }

    public void deletePassenger(int id) {
        connection = null;
        preparedStatement = null;
        try {
            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement("DELETE FROM passengers WHERE id = ?;");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("SQL exception occurred");
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Exception occurred - couldn't close connection");
                e.printStackTrace();
            }
        }
    }
}
