import java.time.LocalDate;

import adapters.MernisServiceAdapter;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerManager;
import concretes.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(new Gamer(1, "Tevhid", "Yüksel", LocalDate.of(1994, 11, 1), "11111111111"));
		
		System.out.println("-----------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1, "Mario", 150));
		
		System.out.println("-----------------------");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "Ramazan kampanyasý", "Ramazan ayý boyunca bütün oyunlar yarý fiyatýna!", 50));
		
		System.out.println("-----------------------");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(new Game(1, "Mario", 150), new Gamer(1, "Tevhid", "Yüksel", LocalDate.of(1994, 11, 1), "11111111111"));
		saleManager.campaignSale(
				new Game(1, "Mario", 150), 
				new Gamer(1, "Tevhid", "Yüksel", LocalDate.of(1994, 11, 1), "11111111111"), 
				new Campaign(1, "Ramazan kampanyasý", "Ramazan ayý boyunca bütün oyunlar yarý fiyatýna!", 50)
				);
		
		System.out.println("-----------------------");


	}

}
