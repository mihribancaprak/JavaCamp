package Abstract;

import Entities.Campaign;

public interface ICampaignService {
  
	void addCampaign(Campaign campaign);
	void removeCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
}
