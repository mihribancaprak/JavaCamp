package interfaces;

public class CustomerManager {
	
	private BaseLogger[] baseLoggers;  //Dependency Injection 
   
	public CustomerManager(BaseLogger[] baseLoggers) {
		this.baseLoggers = baseLoggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi : " + customer.getFirstName());
		
		//this.baseLogger.log(customer.getFirstName());  //Loglanacak bilgi yaz�l�r
		
//		for(BaseLogger logger : baseLoggers) {
//			
//			logger.log(customer.getFirstName());
//		}
		
		Utils.runLoggers(baseLoggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : " +customer.getFirstName());
		
		Utils.runLoggers(baseLoggers, customer.getFirstName());
		
	}
	
}
