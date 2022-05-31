package com.projeto1.avioes.dao;

import java.sql.SQLException;
import java.util.List;

import com.projeto1.avioes.modelo.Avioes;

public interface AviaoDao {
	public int adicionar(Avioes aviao) throws SQLException;
	public Avioes alterar(Avioes aviao) throws SQLException;
	public boolean apagar(long id) throws SQLException;
	public List<Avioes> listar() throws SQLException;
	public Avioes ler(long id) throws SQLException;
}
