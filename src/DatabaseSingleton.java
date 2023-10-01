import java.sql.*;
public class DatabaseSingleton {
    private static DatabaseSingleton instance;
    private DatabaseSingleton(){};
    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            synchronized (DatabaseSingleton.class) {
                if (instance == null) {
                    instance = new DatabaseSingleton();
                }
            }
        }
        return instance;
    }
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/cars";
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(connectionUrl, "postgres", "123");
        } catch (Exception e) {
            throw new SQLException("Failed to get a database connection.", e);
        }
    }

    public void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
