/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hung
 */
public class DBUtils {
    
    public static Connection connection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://localhost/RadioCab?user=root&password=123456";
        return DriverManager.getConnection(url);
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        DBUtils.connection().prepareStatement("select * from User");
    }
    
}
