
package ReadXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "restaurant")
@XmlAccessorType(XmlAccessType.FIELD)

public class Restaurant {
    
    @XmlElement(name = "users")
    private Users u = null;

    public Users getU() {
        return u;
    }

    public void setU(Users u) {
        this.u = u;
    }
    
    @XmlElement(name="dishes")
    private Dishes d;

    public void setD(Dishes d) {
        this.d = d;
    }

    public Dishes getD() {
        return d;
    }
    @XmlElement(name="tables")
    private Tables ta ;

    public Tables getTa() {
        return ta;
    }

    public void setTa(Tables ta) {
        this.ta = ta;
    }
    
    
   
 
    

    
}
