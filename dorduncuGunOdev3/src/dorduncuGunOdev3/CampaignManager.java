package dorduncuGunOdev3;

public class CampaignManager extends Campaign {


	

	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adl� kampanya sisteme eklendi.");

	}

	public void remove(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adl� kampanya sistemden kald�r�ld�.");
	}

	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adl� kampanya g�ncellendi.");
	}
}
