package patronesCreacionales.factory.dao;

import patronesCreacionales.factory.service.DBAdapter;
import patronesCreacionales.factory.util.DBType;

public class DBFactory {

	public static DBAdapter getDBAdapter(DBType dbType) {
		switch (dbType) {
		case MySQL:
			return new MySQLAdapter();
		case Oracle:
			return new OracleAdapter();
		case PostgreSQL:
			return new PostgreSQLAdapter();
		default:
			throw new IllegalArgumentException("Dont supported");
		}
	}
}
