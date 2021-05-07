package dorduncuGunOdev3;

public class CampaignManager extends Campaign {


	

	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanya sisteme eklendi.");

	}

	public void remove(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanya sistemden kaldýrýldý.");
	}

	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " adlý kampanya güncellendi.");
	}
}
