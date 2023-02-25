package JDBCCodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCEx {
    public static void main(String[] args) {
      //  System.out.println("Connecting");
        try {
           // Class.forName("com.mysql.jdbc.Driver");

            // Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Arpita@11");
            System.out.println("connection established program");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
