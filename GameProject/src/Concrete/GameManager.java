package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void addGame(Game game) {
      
		System.out.println("Oyun eklendi :" + game.getName());
	}

	@Override
	public void deleteGame(Game game) {
		
		System.out.println("Oyun silindi :" + game.getName());
		
	}

	@Override
	public void updateGame(Game game) {
		
		System.out.println("Oyun güncellendi :" + game.getName());
		
	}
   	 
} 
