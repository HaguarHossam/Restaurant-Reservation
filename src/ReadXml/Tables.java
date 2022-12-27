/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadXml;


import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tables")
@XmlAccessorType(XmlAccessType.FIELD)

public class Tables {
    @XmlElement(name="table")
    private List<Table> t;

    public List<Table> getT() {
        return t;
    }

    public void setT(List<Table> t) {
        this.t = t;
    }
    
}
