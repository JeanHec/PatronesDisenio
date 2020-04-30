package patronesCreacionales.factory.dao;

import java.sql.Connection;

import patronesCreacionales.factory.service.DBAdapter;

public class PostgreSQLAdapter implements DBAdapter{

	public Connection getConnection() {
		Connection connection = null;
		System.out.println("conexion PostgreSQL");
		return connection;
	}

}
