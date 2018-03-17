
package servicos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de retornoSoap complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="retornoSoap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRetorno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pessoas" type="{http://servicos/}pessoa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="textoRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorRetorno" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoSoap", propOrder = {
    "codRetorno",
    "pessoas",
    "textoRetorno",
    "valorRetorno"
})
public class RetornoSoap {

    protected int codRetorno;
    @XmlElement(nillable = true)
    protected List<Pessoa> pessoas;
    protected String textoRetorno;
    protected double valorRetorno;

    /**
     * Obtém o valor da propriedade codRetorno.
     * 
     */
    public int getCodRetorno() {
        return codRetorno;
    }

    /**
     * Define o valor da propriedade codRetorno.
     * 
     */
    public void setCodRetorno(int value) {
        this.codRetorno = value;
    }

    /**
     * Gets the value of the pessoas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pessoa }
     * 
     * 
     */
    public List<Pessoa> getPessoas() {
        if (pessoas == null) {
            pessoas = new ArrayList<Pessoa>();
        }
        return this.pessoas;
    }

    /**
     * Obtém o valor da propriedade textoRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoRetorno() {
        return textoRetorno;
    }

    /**
     * Define o valor da propriedade textoRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoRetorno(String value) {
        this.textoRetorno = value;
    }

    /**
     * Obtém o valor da propriedade valorRetorno.
     * 
     */
    public double getValorRetorno() {
        return valorRetorno;
    }

    /**
     * Define o valor da propriedade valorRetorno.
     * 
     */
    public void setValorRetorno(double value) {
        this.valorRetorno = value;
    }

}
