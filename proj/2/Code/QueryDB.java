package javaCatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDB {
	public static final String SQL_STATEMENT = "SELECT * FROM POKEMONDB";

	public static Pokemon[] loadDB() throws SQLException {
		Connection connection = DriverManager.getConnection(ConnectDB.JDBC_URL);
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(SQL_STATEMENT);
		ResultSetMetaData resultSetMetaData = resultset.getMetaData();
		int columnCount = resultSetMetaData.getColumnCount();
		int id;
		String name;
		int rate;
		double weight;
		int hpMax;
		int speed;
		boolean ultraBeast;
		String type1;
		String type2;
		Pokemon[] pokemonArray = new Pokemon[802];
		int index = 0;
		
		while (resultset.next()){
			id = resultset.getInt(1);
			name = resultset.getString(2);
			rate = resultset.getInt(3);
			weight = resultset.getDouble(4);
			hpMax = resultset.getInt(5);
			speed = resultset.getInt(6);
			ultraBeast = resultset.getBoolean(7);
			type1 = resultset.getString(8);
			type2 = resultset.getString(9);
			
			pokemonArray[index++] = new Pokemon(id, name, rate, weight, hpMax, speed, ultraBeast, type1, type2);
			
		}
		
		/*for ( int i = 0; i <= 801; i++ ) {
			Pokemon poke = pokemonArray[ i ];
			String pName = poke.getName();
			System.out.println( pName );
		}*/
		
		if(statement != null)
			statement.close();
		if(statement != null)
			connection.close();
		return pokemonArray;
	}
	/*public QueryDB(){
		for ( int i = 0; i <= 801; i++ ) {
			Pokemon poke = pokemonArray[ i ];
		}
	}*/
}