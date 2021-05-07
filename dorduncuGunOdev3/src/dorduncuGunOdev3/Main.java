package dorduncuGunOdev3;

public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer();
		gamer.setFirstName("Yasemin");

		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer);

		EDevletDogrulamaManager devletDogrulamaManager = new EDevletDogrulamaManager();
		devletDogrulamaManager.gamerCheck(gamer);

		Game game = new Game();
		game.setGameName(" Call Of Duty");
		game.setPrice(20);

		GameManager marketManager = new GameManager();
		marketManager.add(gamer, game);
		marketManager.remove(gamer, game);
		marketManager.end(gamer, game);

		Campaign campaign = new Campaign(1, "Muhteþem silahlar");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.remove(campaign);
		campaignManager.update(campaign);

		SaleManager saleManager = new SaleManager();
		saleManager.discountedSale(gamer, game, campaign, campaignManager);
	}

}
