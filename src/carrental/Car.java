/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kyle
 */
public class Car {
        private String ID;
        private CarSpec car;
                
    public Car(String ID, CarSpec car){
        this.ID = ID;
        this.car = car;
    }
    
    public String getID(){
        return this.ID;
    }
    
        
    public List specInfo(){
        List<Object> r = new ArrayList<Object>();
        
        r.add(car.getMake());
        r.add(car.getModel());
        r.add(car.getYear());
        r.add(car.getSize());
        
        return r;
    }
}

