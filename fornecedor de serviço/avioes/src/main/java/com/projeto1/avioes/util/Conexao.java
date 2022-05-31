package com.projeto1.avioes.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	private static final Connection connection = construirConexao();

	private static Connection construirConexao() {
		try {			
			Class.forName("org.postgresql.Driver");			
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/aviao", "postgres",
					"13071995");

		} catch (Exception ex) {
			System.err.println("Conexão falhou: " + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	public static Connection getConnection() {
		return connection;
	}
	

}
