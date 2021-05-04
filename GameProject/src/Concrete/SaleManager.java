package Concrete;

import Abstract.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements ISaleService{

	@Override
	public void sell(Game game, Player player) {
        
		System.out.println( game.getName() + " �simli oyunun sat�n alma i�lemi ger�ekle�tirildi.\n" +
				           "Oyunun fiyat� :" + game.getPrice() +
				           "\nSat�n alan oyuncunun ismi : " + player.getFirstName());
		
	}

	@Override
	public void sell(Game game, Player player, Campaign campaign) {
		
		System.out.println( game.getName() + " �simli oyunun sat�n alma i�lemi ger�ekle�tirildi.\n" +
		                    "Sat�n alan oyuncunun ismi : " + player.getFirstName() +
				            "\nKullan�lan Kampanya :"  + campaign.getName() +
				            "\nYap�lan indirim : " + campaign.getDiscount() +
				            "\n�ndirim sonra toplam fiyat :" + game.getPriceAfterDiscount(campaign));
   		
	}
}
