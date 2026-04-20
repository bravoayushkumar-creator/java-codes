//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class jdbc_1 {
//    public static void main(String[] args) {
//
//        String url = "jdbc:mysql://localhost:3306/ayushdb";
//        String user = "root";
//        String password = "Sattu@786";
//
//        try {
//            Connection con = DriverManager.getConnection(url, user, password);
//            Statement stmt = con.createStatement();
//
//            // Table create
//            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS camera (" +
//                    "cam_id INT PRIMARY KEY, " +
//                    "brand VARCHAR(50), " +
//                    "model VARCHAR(50), " +
//                    "price INT)");
//
//            // Insert 5 rows
//            stmt.executeUpdate("INSERT INTO camera VALUES (1, 'Canon', 'EOS 1500D', 45000)");
//            stmt.executeUpdate("INSERT INTO camera VALUES (2, 'Sony', 'Alpha A7', 120000)");
//            stmt.executeUpdate("INSERT INTO camera VALUES (3, 'Nikon', 'D5600', 55000)");
//            stmt.executeUpdate("INSERT INTO camera VALUES (4, 'Fujifilm', 'XT-200', 60000)");
//            stmt.executeUpdate("INSERT INTO camera VALUES (5, 'Panasonic', 'Lumix G7', 50000)");
//
//            System.out.println("✅ Camera Table + 5 Rows Ready!");
//
//            con.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class jdbc_1 {
//    public static void main(String[] args) {
//
//        String url = "jdbc:mysql://localhost:3306/ayushdb";
//        String user = "root";
//        String password = "Sattu@786";
//
//        try {
//            Connection con = DriverManager.getConnection(url, user, password);
//            Statement stmt = con.createStatement();
//
//            // STEP 1: Purana data hatao (important)
//            stmt.executeUpdate("DELETE FROM camera");
//
//            // STEP 2: 5 rows insert karo
//            stmt.executeUpdate("INSERT INTO camera VALUES (1, 'Canon', 'EOS 1500D', 45000)");
//            stmt.executeUpdate("INSERT INTO camera VALUES (2, 'Sony', 'Alpha A7', 120000)");
//            stmt.executeUpdate("INSERT INTO camera VALUES (3, 'Nikon', 'D5600', 55000)");
//            stmt.executeUpdate("INSERT INTO camera VALUES (4, 'Fujifilm', 'XT-200', 60000)");
//            stmt.executeUpdate("INSERT INTO camera VALUES (5, 'Panasonic', 'Lumix G7', 50000)");
//
//            System.out.println("✅ 5 Rows Inserted Successfully!");
//
//            con.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//
//public class jdbc_1 {
//    public static void main(String[] args) {
//
//        String url = "jdbc:mysql://localhost:3306/ayushdb";
//        String user = "root";
//        String password = "Sattu@786";
//
//        try {
//            // Load driver (optional but safe)
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Connection
//            Connection con = DriverManager.getConnection(url, user, password);
//
//            // SQL query with placeholders
//            String query = "INSERT INTO camera (cam_id, brand, model, price) VALUES (?, ?, ?, ?)";
//
//            // PreparedStatement object
//            PreparedStatement ps = con.prepareStatement(query);
//
//            // Set values
//            ps.setInt(1, 6);
//            ps.setString(2, "Canon");
//            ps.setString(3, "EOS R5");
//            ps.setInt(4, 200000);
//
//            // Execute
//            ps.executeUpdate();
//
//            System.out.println("✅ Data Inserted using PreparedStatement!");
//
//            con.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//import java.sql.*;
//
//public class jdbc_1 {
//    public static void main(String[] args) {
//
//        try {
//            // 1. Load Driver (optional in new versions)
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // 2. Create Connection
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/ayushdb",
//                    "root",
//                    "Sattu@786"
//            );
//
//            System.out.println("Connected Successfully ✅");
//
//            // 3. Prepare CallableStatement
//            CallableStatement cs = con.prepareCall("{call getCamera()}");
//
//            // 4. Execute
//            ResultSet rs = cs.executeQuery();
//
//            // 5. Display Data
//            System.out.println("ID | BRAND | MODEL | PRICE");
//
//            while (rs.next()) {
//                System.out.println(
//                        rs.getInt(1) + " | " +
//                                rs.getString(2) + " | " +
//                                rs.getString(3) + " | " +
//                                rs.getInt(4)
//                );
//            }
//
//            // 6. Close
//            rs.close();
//            cs.close();
//            con.close();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
import java.sql.*;

public class jdbc_1 {
    public static void main(String[] args) {

        try {
            // 1. Load Driver (optional for latest JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ayushdb",
                    "root",
                    "Sattu@786"
            );

            System.out.println("Connected Successfully ✅");

            // 3. Prepare CallableStatement
            CallableStatement cs = con.prepareCall("{call getCamera()}");

            // 4. Execute procedure
            ResultSet rs = cs.executeQuery();

            // 5. Print heading
            System.out.println("ID | BRAND | MODEL | PRICE");
            System.out.println("--------------------------------");

            // 6. Display data
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " | " +
                                rs.getString(2) + " | " +
                                rs.getString(3) + " | " +
                                rs.getInt(4)
                );
            }

            // 7. Close resources
            rs.close();
            cs.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}