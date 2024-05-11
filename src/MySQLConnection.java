

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    public static final String URL =
            "jdbc:mysql://192.168.137.1:3306/dbwaldas";
    public static final String USERNAME = "client";
    public static final String PASSSWORD = "12345678";
    static Connection getConnection(){


        Connection c = null;
        try{
            c= DriverManager.getConnection(URL, USERNAME,PASSSWORD);
            System.out.println("DB Connection Success");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return c;
    }

    public static void main(String[] args) {


        Connection c= getConnection();
        try{
            c.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
