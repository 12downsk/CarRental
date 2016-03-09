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
public class Customer {
    private String name;
    private String phone;
    private String address;
    private Rental rentals[];
    
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
    
    public void newRental()
    {
        
    }
    
    public Rental[] getRentals()
    {
        
        return rentals;
    }
    
    
}
