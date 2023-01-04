package mysql.labs;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.*;

public class CreateUpdateData extends SqlConnection{

    String db;
    String connectionString;
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    CreateUpdateData(String db) {
        this.db = "air_travel";

        try {
            connectionString = "jdbc:mysql://localhost/" + db
                    + "?user=" + user + "&password=" + URLEncoder.encode(pass, "UTF-8")
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Exception occurred - driver not found on classpath");
//            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            System.out.println("Password could not be encoded");
            e.printStackTrace();
        }
    }

    public void createFlight(int plane_id, int from_id, int to_id, String date, int price) {
        connection = null;
        preparedStatement = null;

        try {
            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement("INSERT INTO `flights`" +
                    "(`plane_id`, `destination_from_id`, `destination_to_id`, `datetime`, `price`)" +
                    "VALUES (?, ?, ?, ?, ?);");
            preparedStatement.setString(4,date);
            preparedStatement.setInt(1, plane_id);
            preparedStatement.setInt(2, from_id);
            preparedStatement.setInt(3, to_id);
            preparedStatement.setInt(5, price);
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

    public void createPassenger(String first_name, String last_name, String email) {
        connection = null;
        preparedStatement = null;

        try {
            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement("INSERT into passengers " +
                    "(first_name, last_name, email)" +
                    "VALUES (?, ?, ?);");
            preparedStatement.setString(1, first_name);
            preparedStatement.setString(2, last_name);
            preparedStatement.setString(3, email);
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

    public void updateFlight(int id, int plane_id, int from_id, int to_id, String date, int price) {
        connection = null;
        preparedStatement = null;

        try {
            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement("UPDATE flights " +
                    "SET plane_id = ?, destination_from_id = ?, destination_to_id = ?, datetime = ?, price = ? " +
                    "WHERE id = ?;");
            preparedStatement.setString(4, date);
            preparedStatement.setInt(1, plane_id);
            preparedStatement.setInt(2, from_id);
            preparedStatement.setInt(3, to_id);
            preparedStatement.setInt(5, price);
            preparedStatement.setInt(6, id);
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

    public void updatePassenger(int id, String first_name, String last_name, String email) {
        connection = null;
        preparedStatement = null;

        try {
            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement("UPDATE passengers " +
                    "SET first_name = ?, last_name = ?, email = ? " +
                    "WHERE id = ?;");
            preparedStatement.setString(1, first_name);
            preparedStatement.setString(2, last_name);
            preparedStatement.setString(3, email);
            preparedStatement.setInt(4, id);
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
