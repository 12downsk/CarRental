/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.util.Calendar;

/**
 *
 * @author 12dow_000
 */
public class Rental {
    private Calendar rentDate;
    private Calendar returnDate;
    private Enum status;
    private Car c;
    
    public Rental(Calendar rentDate, Enum status, Car c)
    {
        this.rentDate = rentDate;
        this.status = status;
        this.c = c;
    }
    
    public Enum getStatus(){
        return status;
    }
    
    public Car getCar(){
        return c;
    }
    
    public String getReturnDate(){
        return returnDate.toString();
    }
    
    public String getRentDate(){
        return rentDate.toString();
    }
    
    public void setReturnDate(Calendar ReturnDate){
        this.returnDate = ReturnDate;
    }
    
    
}
