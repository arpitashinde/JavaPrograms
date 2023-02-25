package JDBCCodes;

import java.sql.*;

public class JDBCReadEx {
    public static void main(String[] args) {
        try {
         //   Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection newcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Arpita@11");
            System.out.println("connection established program");

            //for reading the table from database
            /*
            go to sql run command line
            type connect
            enter your username and password
            enter your query --> select * from table

            */

            Statement st = newcon.createStatement();

            ResultSet rs = st.executeQuery("select * from db1.student");
            System.out.println("Id \t Name \tMarks");
            while (rs.next()){
                System.out.println(rs.getInt("idStudent")+"\t"+ rs.getString("Name")+"\t"+ rs.getInt("Marks"));
            }
        }  catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
