package dorduncuGunOdev3;

public class SaleManager implements Sale {


	@Override
	public void discountedSale(Gamer gamer, Game game, Campaign campaign, CampaignManager campaignManager) {
		double discountPrice = game.getPrice() - (game.getPrice() / 100) * 10;
		System.out.println(gamer.getFirstName() + " adl� oyuncu," + game.getGameName() +  " adl� oyunu " + 
		campaignManager.getCampaignName()+ " kampanyas�ndan yararlanarak, " + discountPrice + " tl'ye %10 indirimli sat�n ald�.");
		
		
		
	}
}
