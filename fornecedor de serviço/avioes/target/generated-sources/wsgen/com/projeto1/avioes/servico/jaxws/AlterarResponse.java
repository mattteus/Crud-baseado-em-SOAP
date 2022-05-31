
package com.projeto1.avioes.servico.jaxws;

import com.projeto1.avioes.modelo.Avioes;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "alterarResponse", namespace = "http://servico.avioes.projeto1.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarResponse", namespace = "http://servico.avioes.projeto1.com/")
public class AlterarResponse {

    @XmlElement(name = "return", namespace = "")
    private Avioes _return;

    /**
     * 
     * @return
     *     returns Avioes
     */
    public Avioes getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Avioes _return) {
        this._return = _return;
    }

}
