/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

/**
 *
 * @author 12dow_000
 */
public class CarSpec {
    private int ID;
    private String make;
    private String model;
    private int year;
    private Enum size;
    
    
    public CarSpec(String make, String model, int year, Enum size){
        this.ID = ID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.size = size;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getYear(){
        return year;
    }
    
    public Enum getSize(){
        return size;
    }
    public void f(){
        System.out.println("carSPEC");
    }
}
