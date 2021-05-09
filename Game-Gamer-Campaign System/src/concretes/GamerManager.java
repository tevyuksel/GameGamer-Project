package concretes;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;


	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu kaydedildi. " + gamer.getFirstName() + " hoþgeldin!");			
		} 
		
		else {
			System.out.println("Kayýt baþarýsýz.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi -> " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi -> " + gamer.getFirstName());
		
	}

}
