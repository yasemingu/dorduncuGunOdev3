package dorduncuGunOdev3;

public class Campaign extends Game{

	int id;
	String campaignName;
	
	public Campaign () {
		
	}
	
	
	
	public Campaign(int id, String campaignName) {
		super();
		this.id = id;
		this.campaignName = campaignName;
	
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	
	
	
	
	
}
