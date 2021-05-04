package Adapters;

import java.rmi.RemoteException;

import Abstract.IPlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService{

	@Override
	public boolean checkIfRealPlayer(Player player) {
		 
        KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = false;
		try {
			return kpsPublic.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),player.getFirstName(),player.getLastName(),player.getDateOfBirth().getYear());
   
		}catch(RemoteException e) {
			
		}
		return result;
	}

}
