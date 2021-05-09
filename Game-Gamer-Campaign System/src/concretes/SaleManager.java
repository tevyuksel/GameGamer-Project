package concretes;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + game.getGameName() + " oyununu " + game.getUnitPrice() + " TL'den satýn aldý.");

	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " " + game.getGameName() + " oyununu " + 
				campaign.getName() + " ile %" + campaign.getDiscount() + " indirim ile " + game.getUnitPrice()/2 + " TL'den satýn aldý.");
		
	}

}
