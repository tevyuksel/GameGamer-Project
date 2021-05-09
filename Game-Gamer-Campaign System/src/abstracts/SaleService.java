package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SaleService {
	
	void sale(Game game, Gamer gamer);
	void campaignSale(Game game, Gamer gamer, Campaign campaign);
}
