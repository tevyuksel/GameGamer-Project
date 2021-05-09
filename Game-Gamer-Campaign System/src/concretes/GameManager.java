package concretes;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Eklenen oyun -> " + game.getGameName());
			
	}

	@Override
	public void delete(Game game) {
		System.out.println("Silinen oyun -> " + game.getGameName());

		
	}

	@Override
	public void update(Game game) {
		System.out.println("G�ncellenen oyun -> " + game.getGameName());

		
	}

}
