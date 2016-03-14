/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author 12dow_000
 */
public class Customer {
    private String name;
    private String phone;
    private String address;
    private ArrayList<Rental> rentals = new ArrayList();
    
    public Customer(String Name, String Phone, String Address){
        this.name = Name;
        this.phone = Phone;
        this.address = Address;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void newRental(Calendar rentDate, Calendar returnDate, Car c, Status status)
    {
        rentals.add(new Rental(rentDate,returnDate,status, c));
    }
    
    public ArrayList<Rental> getRented()
    {
        
        return rentals;
    }
    
    public ArrayList<Rental> getReturned(){
        
        return rentals;
    }
    
    public ArrayList displayData()
    {
        ArrayList<String> r = new ArrayList();
        r.add(name);
        r.add(phone);
        r.add(address);
        return r;
    }
    public void f(){
        System.out.println("customer");
    }
    
    
}
