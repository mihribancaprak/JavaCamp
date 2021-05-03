package homework3;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
     
		BaseCustomerManager bCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1,"Mihriban","Þahin",new Date(1994,03,04),"245846"); 
		bCustomerManager.save(customer);
		
		
		 
	}

}
