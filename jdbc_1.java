import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;

public class jdbc_1 {
}
public static void main(String[] args){

    String driver_name="com.mysql.cj.jdbc.Driver";
    String host="jdbc:mysql://localhost:3306/employeedb";
    String username="root";
    String pwd="";
    String create """
            CREATE TABLE IF NOT EXISTS employee(
            id INT PRIMARY KEY AUTO_INCREMENT,
            name VARCHAR(50) NOT NULL,
            DEPT VARCHAR(50),
            salary DECIMAL(10,2)
            )
            
            """
    try {
        class.forName(driver_name);
        System.out.println("Driver is ready!");
        Connection con= DriverManager.getConnection(host,username,pwd);
        System.out.println("host is ready!");

    }catch ( ClassNotFoundException| SQLClientInfoException)


}
