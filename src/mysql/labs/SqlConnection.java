package mysql.labs;

import java.sql.*;

public class SqlConnection {
    String db;
    String user;
    String pass;

    String connectionString = "jdbc:mysql://localhost/" + db
            + "?user=" + user + "&password=" + pass
            + "&useSSL=false&allowPublicKeyRetrieval=true";

    SqlConnection(String db, String user, String pass) {
        this.db = db;
        this.user = user;
        this.pass = pass;
    }

    public void updateStatement() {
        Connection connection = null;
        PreparedStatement preparedStatement= null;
        ResultSet resultset = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connectionString);
            preparedStatement = connection.prepareStatement("");
            preparedStatement.setString(1,"");
            preparedStatement.executeUpdate("");
        } catch (SQLException e) {
            System.out.println("SQL exception occurred");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
                resultset.close();
            } catch (SQLException e) {
                System.out.println("Exception occurred - couldn't close connection");
                e.printStackTrace();
            }
        }

    }
}
