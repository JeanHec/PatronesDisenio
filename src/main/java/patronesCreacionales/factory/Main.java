package patronesCreacionales.factory;

import java.sql.Connection;
import java.sql.SQLException;

import patronesCreacionales.factory.dao.DBFactory;
import patronesCreacionales.factory.service.DBAdapter;
import patronesCreacionales.factory.util.DBType;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException {
		
		DBAdapter dbAdapter = DBFactory.getDBAdapter(DBType.MySQL);
		Connection connection = dbAdapter.getConnection();
//		Statement statement = connection.createStatement();
//		statement.execute("select * from table");

	}

}
