package interfaces;

public class Main {

	public static void main(String[] args) {
        
		BaseLogger[] baseLoggers = {new EmailLogger(),new SmsLogger()};
		
		CustomerManager customerManager=new CustomerManager(baseLoggers);
		
		Customer customer = new Customer(1,"Mihriban","Þahin");
		
		customerManager.add(customer);
	}

}
