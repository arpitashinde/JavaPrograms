package JDBCCodes;

import java.sql.*;

public class JDBCReadEx {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection newcon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
            System.out.println("connection established program");
            //for reading the table from database
            /*
            go to sql run command line
            type connect
            enter your username and password
            enter your query --> select * from table

            */
            
            Statement st = newcon.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Table");
            while (rs.next()){
                System.out.println(rs.getInt("NO")+ rs.getString("NAME"));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
