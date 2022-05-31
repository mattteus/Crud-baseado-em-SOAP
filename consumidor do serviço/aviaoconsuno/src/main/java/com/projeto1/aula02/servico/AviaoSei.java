
package com.projeto1.aula02.servico;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "AviaoSei", targetNamespace = "http://servico.avioes.projeto1.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AviaoSei {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "apagar", targetNamespace = "http://servico.avioes.projeto1.com/", className = "com.projeto1.aula02.servico.Apagar")
    @ResponseWrapper(localName = "apagarResponse", targetNamespace = "http://servico.avioes.projeto1.com/", className = "com.projeto1.aula02.servico.ApagarResponse")
    @Action(input = "http://servico.avioes.projeto1.com/AviaoSei/apagarRequest", output = "http://servico.avioes.projeto1.com/AviaoSei/apagarResponse")
    public boolean apagar(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "adicionar", targetNamespace = "http://servico.avioes.projeto1.com/", className = "com.projeto1.aula02.servico.Adicionar")
    @ResponseWrapper(localName = "adicionarResponse", targetNamespace = "http://servico.avioes.projeto1.com/", className = "com.projeto1.aula02.servico.AdicionarResponse")
    @Action(input = "http://servico.avioes.projeto1.com/AviaoSei/adicionarRequest", output = "http://servico.avioes.projeto1.com/AviaoSei/adicionarResponse")
    public int adicionar(
        @WebParam(name = "arg0", targetNamespace = "")
        Avioes arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.projeto1.aula02.servico.Avioes
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ler", targetNamespace = "http://servico.avioes.projeto1.com/", className = "com.projeto1.aula02.servico.Ler")
    @ResponseWrapper(localName = "lerResponse", targetNamespace = "http://servico.avioes.projeto1.com/", className = "com.projeto1.aula02.servico.LerResponse")
    @Action(input = "http://servico.avioes.projeto1.com/AviaoSei/lerRequest", output = "http://servico.avioes.projeto1.com/AviaoSei/lerResponse")
    public Avioes ler(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.projeto1.aula02.servico.Avioes>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://servico.avioes.projeto1.com/", className = "com.projeto1.aula02.servico.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://servico.avioes.projeto1.com/", className = "com.projeto1.aula02.servico.ListarResponse")
    @Action(input = "http://servico.avioes.projeto1.com/AviaoSei/listarRequest", output = "http://servico.avioes.projeto1.com/AviaoSei/listarResponse")
    public List<Avioes> listar();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.projeto1.aula02.servico.Avioes
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "alterar", targetNamespace = "http://servico.avioes.projeto1.com/", className = "com.projeto1.aula02.servico.Alterar")
    @ResponseWrapper(localName = "alterarResponse", targetNamespace = "http://servico.avioes.projeto1.com/", className = "com.projeto1.aula02.servico.AlterarResponse")
    @Action(input = "http://servico.avioes.projeto1.com/AviaoSei/alterarRequest", output = "http://servico.avioes.projeto1.com/AviaoSei/alterarResponse")
    public Avioes alterar(
        @WebParam(name = "arg0", targetNamespace = "")
        Avioes arg0);

}
