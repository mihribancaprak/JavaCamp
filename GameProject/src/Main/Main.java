package Main;

import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
 
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		Player player = new Player(1, "Mihriban", "Þahin", new Date(1994,03,04), "11111111");
		playerManager.addPlayer(player);
		
		GameManager gameManager = new GameManager();
		Game game= new Game(1, "CodyCross", 100);
		gameManager.addGame(game);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Bayram indirimi", 25);
		campaignManager.addCampaign(campaign);
		
		System.out.println("\nSATIN ALMA ÝÞLEMÝ : \n");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(game, player);
		
		System.out.println("\nKAMPANYALI SATIÞ : \n");
		
		saleManager.sell(game, player, campaign);

		
	}

}
