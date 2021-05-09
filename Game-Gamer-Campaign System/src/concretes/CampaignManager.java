package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Eklenen kampanya -> %" + campaign.getDiscount() + " " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Silinen kampanya -> " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Güncellenen kampanya -> " + campaign.getName());
		
	}

}
