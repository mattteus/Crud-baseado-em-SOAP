package com.projeto1.avioes.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;


import com.projeto1.avioes.modelo.Avioes;

public class AviaoImp implements AviaoDao{
	
	private Connection connection;
	
	public AviaoImp(Connection connection) {
		this.connection = connection;
	}
	

	@Override
	public int adicionar(Avioes aviao) throws SQLException {
	
		
		Statement stmt = null;
		int id = 0;
		try {
		
			String sql = "insert into aviao (nome, fabricante, modelo)"+
					" values (\'"+aviao.getNome()+"\',\'"+aviao.getFabricante()+"\',\'"+ aviao.getModelo() +"\') RETURNING ID";
			stmt = this.connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				id = rs.getInt(1);
	        }			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt.close();
		}
		return id;
		
		
		
	}

	@Override
	public Avioes alterar(Avioes aviao) throws SQLException {
		PreparedStatement stmt = null;
		try {
			String sql = "update aviao set nome = ? , fabricante = ? , modelo = ? "
					   + "where id = ? ;";
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, aviao.getNome());		
			stmt.setString(2, aviao.getFabricante());
			stmt.setString(3, aviao.getModelo());
			stmt.execute();			
			return ler(aviao.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			stmt.close();
		}
		return null;
	}

	@Override
	public boolean apagar(long id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Avioes> listar() throws SQLException {
		ArrayList<Avioes> aviao = new ArrayList<Avioes>();
		Statement stmt = null;
		try {
			String sql = "select * from aviao";
			stmt = this.connection.createStatement();
		    ResultSet rs = stmt.executeQuery(sql);		    
		    while (rs.next()) {
		    	Avioes not = new Avioes();
	            not.setId(rs.getInt("id"));
	            not.setNome(rs.getString("nome"));
	            not.setFabricante(rs.getString("fabricante"));
	            not.setModelo(rs.getString("modelo"));
	            
	            aviao.add(not);
	        }			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			stmt.close();
		}
		return aviao;
	}

	@Override
	public Avioes ler(long id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
