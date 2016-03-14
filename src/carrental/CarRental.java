/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author 12dow_000
 */
public class CarRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Customer> clients = new ArrayList();
        ArrayList<CarSpec> cars = new ArrayList();
        ArrayList<Car> inventory = new ArrayList();
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DATE, 10);
        
        cal2.set(Calendar.YEAR, 2016);
        cal2.set(Calendar.MONTH, 3);
        cal2.set(Calendar.DATE, 13);
        
        clients.add(new Customer("Bob","816-555-555","123 Main St"));
        clients.add(new Customer("Joe","913-555-555","321 Oak St"));
        clients.add(new Customer("Steve","321-555-5555","258 Cherry St"));
        
        cars.add(new CarSpec("Honda","Civic",2010,Size.SMALL));
        cars.add(new CarSpec("Ford","Explorer",2012,Size.MIDSIZE));
        cars.add(new CarSpec("Chevy","Silverado",2016,Size.LARGE));
        
        inventory.add(new Car("1001",cars.get(0)));
        inventory.add(new Car("1002",cars.get(0)));
        inventory.add(new Car("1003",cars.get(1)));
        inventory.add(new Car("1004",cars.get(1)));
        inventory.add(new Car("1005",cars.get(2)));
        inventory.add(new Car("1006",cars.get(2)));
        
        CustomerFrameGUI w = new CustomerFrameGUI(clients, inventory);
        w.setVisible(true);
       
    }    
}
