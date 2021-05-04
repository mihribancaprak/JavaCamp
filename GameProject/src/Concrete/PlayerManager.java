package Concrete;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Player;

public class PlayerManager implements IPlayerService{

	private IPlayerCheckService playerCheckService ;
	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}
  
	@Override
	public void addPlayer(Player player) {
		
		if(playerCheckService.checkIfRealPlayer(player)) {
			System.out.println("Oyuncu eklendi : " + player.getFirstName());
 		}
		else {
			System.out.println("Geçerli bir oyuncu girmediniz!");
		}
		
	}

	@Override
	public void deletePlayer(Player player) {
		
		System.out.println("Oyuncu silindi :" + player.getFirstName());
		
	}

	@Override
	public void updatePlayer(Player player) {
		
		System.out.println("Oyuncu güncellendi :" + player.getFirstName());		
	}
	
	
 
}
