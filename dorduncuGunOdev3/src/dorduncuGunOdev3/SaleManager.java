package dorduncuGunOdev3;

public class SaleManager implements Sale {


	@Override
	public void discountedSale(Gamer gamer, Game game, Campaign campaign, CampaignManager campaignManager) {
		double discountPrice = game.getPrice() - (game.getPrice() / 100) * 10;
		System.out.println(gamer.getFirstName() + " adlý oyuncu," + game.getGameName() +  " adlý oyunu " + 
		campaignManager.getCampaignName()+ " kampanyasýndan yararlanarak, " + discountPrice + " tl'ye %10 indirimli satýn aldý.");
		
		
		
	}
}
