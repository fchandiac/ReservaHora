
package com.iplacex.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://184.175.93.196:3306/karmikac_pet";
	private static final String USUARIO = "karmikac_petuser";
	private static final String CLAVE = "";

	public Connection conectar(String CLAVE) {
		
		Connection conexion = null;
		
		try {
			Class.forName(CONTROLADOR);
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexión OK");

		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		return conexion;
	}
	
	public boolean test(String CLAVE) {
		
		Connection conexion = null;
		boolean result = false;
		
		try {
			Class.forName(CONTROLADOR);
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexión OK");
			result = true;

		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
			result = false;

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
			result = false;
		}
		
		return result;
	}

	public static void main(String[] args) {

	}

}
