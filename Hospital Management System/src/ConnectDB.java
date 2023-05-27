

import java.sql.*;

public class ConnectDB {
    Connection con;
   Statement s;
    public ConnectDB () {
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hospital_database";
            String username = "root";
            String password = "srinu123";
            con = DriverManager.getConnection(url, username, password);
            s=con.createStatement();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}

