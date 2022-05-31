package com.projeto1.avioes.servico;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.projeto1.avioes.dao.AviaoDao;
import com.projeto1.avioes.dao.AviaoImp;
import com.projeto1.avioes.modelo.Avioes;
import com.projeto1.avioes.util.Conexao;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.projeto1.avioes.servico.AviaoSei")
public class AviaoSib implements AviaoSei {

	@Override
	public int adicionar(Avioes av) {
		Connection con = Conexao.getConnection(); 
		AviaoDao dao = new AviaoImp(con);
		int id = 0;
        try {
        	id = dao.adicionar(av);
        	return id;
        } catch (SQLException e) {
            e.printStackTrace();           
        }
        return id;
	}

	@Override
	public Avioes alterar(Avioes av) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean apagar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Avioes> listar() {
		
		Connection con = Conexao.getConnection(); 
		AviaoDao dao = new AviaoImp(con);
		List<Avioes> av = new ArrayList<Avioes>();
        try {
        	av = dao.listar();
            return av;
        } catch (SQLException e) {
            e.printStackTrace();            
        }
        return av;
        
	}

	@Override
	public Avioes ler(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

}
