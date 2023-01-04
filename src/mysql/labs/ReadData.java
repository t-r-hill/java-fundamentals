package mysql.labs;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.*;
import java.util.stream.Stream;

public class ReadData extends SqlConnection{

    String db;
    String connectionString;
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    ReadData(String db) {
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

    public String readFlight(int id) {
        connection = null;
        preparedStatement = null;
        resultSet = null;
        String output = "";

        try {
            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement("SELECT `plane_id`, `destination_from_id`, `destination_to_id`, `datetime`, `price` " +
                    "FROM flights " +
                    "WHERE id = ?;");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            String[] columns = {"plane_id", "destination_from_id", "destination_to_id", "datetime", "price"};
            while (resultSet.next()) {
                for (String col : columns){
                    if (col == "datetime"){
                        output += col + " = " + resultSet.getString(col) + "\n";
                    } else{
                        output += col + " = " + resultSet.getInt(col) + "\n";
                    }
                }
                output += "\n";
            }
        } catch (SQLException e) {
            System.out.println("SQL exception occurred");
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException e) {
                System.out.println("Exception occurred - couldn't close connection");
                e.printStackTrace();
            }
        }
        return output;
    }

    public String readPassenger(int id) {
        connection = null;
        preparedStatement = null;
        resultSet = null;
        String output = "";
        String[] columns = {"first_name", "last_name", "email"};
        String colsAsString = String.join(", ", columns);
        String query = "SELECT " + colsAsString + " " +
                "FROM passengers " +
                "WHERE id = ?;";

        try {
            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                for (String col : columns){
                        output += col + " = " + resultSet.getString(col) + "\n";
                }
                output += "\n";
            }
        } catch (SQLException e) {
            System.out.println("SQL exception occurred");
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException e) {
                System.out.println("Exception occurred - couldn't close connection");
                e.printStackTrace();
            }
        }
        return output;
    }
}
