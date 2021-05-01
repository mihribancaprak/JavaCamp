package interfaces;

public class CustomerManager {
	
	private BaseLogger[] baseLoggers;  //Dependency Injection 
   
	public CustomerManager(BaseLogger[] baseLoggers) {
		this.baseLoggers = baseLoggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : " + customer.getFirstName());
		
		//this.baseLogger.log(customer.getFirstName());  //Loglanacak bilgi yazýlýr
		
//		for(BaseLogger logger : baseLoggers) {
//			
//			logger.log(customer.getFirstName());
//		}
		
		Utils.runLoggers(baseLoggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : " +customer.getFirstName());
		
		Utils.runLoggers(baseLoggers, customer.getFirstName());
		
	}
	
}
