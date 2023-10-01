import java.sql.*;
public class Main {
    public static void main(String[] args) {
        DatabaseSingleton databaseSingleton = DatabaseSingleton.getInstance();
        try {
            Connection connection = databaseSingleton.getConnection();
            System.out.println("DB successfully connected.");

            String sql = "SELECT COUNT(*) AS bmw_count FROM cars WHERE brand = 'BMW'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int bmwCount = rs.getInt("bmw_count");
                System.out.println("Number of BMW cars in the database: " + bmwCount);
            }

            databaseSingleton.closeConnection(connection);
            System.out.println("DB connection closed.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}