package patronesCreacionales.factory.dao;

import java.sql.Connection;

import patronesCreacionales.factory.service.DBAdapter;

public class OracleAdapter implements DBAdapter{

	public Connection getConnection() {
		Connection connection = null;
		System.out.println("conexion Oracle");
		return connection;
	}

}
