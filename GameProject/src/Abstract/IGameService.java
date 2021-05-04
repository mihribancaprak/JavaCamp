package Abstract;

import Entities.Game;

public interface IGameService {
	
   void addGame(Game game);
   void deleteGame(Game game);
   void updateGame(Game game);
}
