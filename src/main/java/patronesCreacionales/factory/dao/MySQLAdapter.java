package patronesCreacionales.factory.dao;

import java.sql.Connection;

import patronesCreacionales.factory.service.DBAdapter;

public class MySQLAdapter implements DBAdapter{

	public Connection getConnection() {
		Connection connection = null;
		System.out.println("conexion MySQL");
		return connection;
	}

}
