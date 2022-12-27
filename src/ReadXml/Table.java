/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "table")
@XmlAccessorType(XmlAccessType.FIELD)

public class Table {
    @XmlElement(name ="number")
    private int number;
    @XmlElement(name="number_of_seats")
    private int numberOfSeats;
    @XmlElement(name="smoking")
    private boolean somking;
    @XmlElement(name="time_of_reservation")
    private String timeOfReservation;

    public int getNumber() {
        return number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSomking() {
        return somking;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setSomking(boolean somking) {
        this.somking = somking;
    }

    public void setTimeOfReservation(String timeOfReservation) {
        this.timeOfReservation = timeOfReservation;
    }

    public String getTimeOfReservation() {
        return timeOfReservation;
    }

   
    
    
}
