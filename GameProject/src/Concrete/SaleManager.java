package Concrete;

import Abstract.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements ISaleService{

	@Override
	public void sell(Game game, Player player) {
        
		System.out.println( game.getName() + " Ýsimli oyunun satýn alma iþlemi gerçekleþtirildi.\n" +
				           "Oyunun fiyatý :" + game.getPrice() +
				           "\nSatýn alan oyuncunun ismi : " + player.getFirstName());
		
	}

	@Override
	public void sell(Game game, Player player, Campaign campaign) {
		
		System.out.println( game.getName() + " Ýsimli oyunun satýn alma iþlemi gerçekleþtirildi.\n" +
		                    "Satýn alan oyuncunun ismi : " + player.getFirstName() +
				            "\nKullanýlan Kampanya :"  + campaign.getName() +
				            "\nYapýlan indirim : " + campaign.getDiscount() +
				            "\nÝndirim sonra toplam fiyat :" + game.getPriceAfterDiscount(campaign));
   		
	}
}
