package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		
		System.out.println("Kampanya eklendi : " + campaign.getName());
	}

	@Override
	public void removeCampaign(Campaign campaign) {
		
		System.out.println("Kampanya kald�r�ld� : " + campaign.getName());

	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println("Kampanya g�ncellendi : " + campaign.getName());

	}
   

}
