/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.util.HashMap;
import java.util.Map;

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
    
        
    public Map getInfo(){
        Map carInfo = new HashMap();
        
        carInfo.put("Make", car.getMake());
        carInfo.put("Model", car.getModel());
        carInfo.put("Year", car.getYear());
        carInfo.put("Size", car.getSize());
        carInfo.put("ID", ID);
        
        return carInfo;
    }
}

