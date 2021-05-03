package homework3;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {

		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = false;
		try {
			return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth().getYear());
   
		}catch(RemoteException e) {
			
		}
		return result;
		
		
	}
   
}

