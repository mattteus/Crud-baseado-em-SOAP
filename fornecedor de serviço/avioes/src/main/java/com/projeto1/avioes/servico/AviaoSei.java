package com.projeto1.avioes.servico;

import java.util.List;



import com.projeto1.avioes.modelo.Avioes;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
@WebService
@SOAPBinding (style = Style.DOCUMENT)
public interface AviaoSei {	
		
		@WebMethod
		public int adicionar(Avioes av);
		
		@WebMethod
		public Avioes alterar(Avioes av);
		
		@WebMethod
		public boolean apagar(long id);
		
		@WebMethod
		public List<Avioes> listar();
		
		@WebMethod
		public Avioes ler(int id);
	
}
