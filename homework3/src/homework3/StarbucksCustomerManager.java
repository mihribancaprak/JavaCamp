package homework3;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealCustomer(customer)) {
		   super.save(customer);
	    }
		else {
			System.out.println("Geçerli bir kiþi girmediniz");
		}
		
	}

}
