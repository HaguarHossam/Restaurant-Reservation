/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadXml;

import Gui.LoginWindow;
import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {
   public static void main(String[] args) throws JAXBException {
   JAXBContext jax = JAXBContext.newInstance(Restaurant.class);
             Unmarshaller u = jax.createUnmarshaller();
        Restaurant r = (Restaurant) u.unmarshal(new File("Restaurant.xml"));

        List<User> list = r.getU().getUsers();
        for (int i = 0; i < list.size(); i++) {
          System.out.println(list.get(i).getName());
          List<Dish> l= r.getD().getDi();
            for (int j = 0; j < l.size(); j++) {
                System.out.println(l.get(j).getName());
                List<Table> li=r.getTa().getT();
                for (int k = 0; k < li.size(); k++) {
                    System.out.println(li.get(k).getNumber());
                    
                }
                
            }
           
        }
       
  
}
}
