package javaCatch;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectDB {
	public static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_URL = "jdbc:derby:C:/derby/db-derby-10.13.1.1-bin/bin/POKEMONDB";
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
    	Class.forName(DRIVER);
    	Connection connection = DriverManager.getConnection(JDBC_URL);
    }
}