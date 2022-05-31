package com.projeto1.avioes;

import com.projeto1.avioes.servico.AviaoSib;

import jakarta.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Endpoint.publish("http://localhost:8086/servico/aviao", new AviaoSib());
        System.out.println( "serviço ativo! link | http://localhost:8086/servico/aviao" );
    }
}
