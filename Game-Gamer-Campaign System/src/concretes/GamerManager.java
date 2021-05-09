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
			System.out.println("Oyuncu kaydedildi. " + gamer.getFirstName() + " ho�geldin!");			
		} 
		
		else {
			System.out.println("Kay�t ba�ar�s�z.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi -> " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu g�ncellendi -> " + gamer.getFirstName());
		
	}

}
