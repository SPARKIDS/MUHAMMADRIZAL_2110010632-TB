package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection mysqlkonek;
    public static Connection koneksiDB()throws SQLException{
        if(mysqlkonek==null){
    } else {
            try{
                String DB = "jdbc:mysql://localhost:3306/ppdb";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek=(Connection)DriverManager.getConnection(DB,user,pass);
            
            }catch (Exception e){
                
            }
        }return mysqlkonek;
    }
}
