
package com.projeto1.avioes.servico.jaxws;

import com.projeto1.avioes.modelo.Avioes;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "alterar", namespace = "http://servico.avioes.projeto1.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterar", namespace = "http://servico.avioes.projeto1.com/")
public class Alterar {

    @XmlElement(name = "arg0", namespace = "")
    private Avioes arg0;

    /**
     * 
     * @return
     *     returns Avioes
     */
    public Avioes getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Avioes arg0) {
        this.arg0 = arg0;
    }

}
