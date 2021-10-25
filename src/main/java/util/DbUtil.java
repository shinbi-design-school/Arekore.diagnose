package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//DB データパスの取得
public class DbUtil {
	private static final String DB_DRIVER = "jdbc:mysql://localhost:8889/bts";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "password";
	
    public static Connection connect() throws SQLException,ClassNotFoundException{
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection connection = DriverManager.getConnection(DB_DRIVER,DB_USER,DB_PASSWORD);
    	
    	return connection;
    }
}
