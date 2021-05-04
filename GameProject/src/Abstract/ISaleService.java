package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface ISaleService {
	
	 void sell(Game game , Player player);
	 void sell(Game game,Player player,Campaign campaign);
   
}
