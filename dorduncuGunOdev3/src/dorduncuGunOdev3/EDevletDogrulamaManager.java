package dorduncuGunOdev3;

public class EDevletDogrulamaManager implements EDevletDogrulama{
	@Override
	public boolean gamerCheck(Gamer gamer) {
		if (gamer.getFirstName()=="Yasemin") {
			System.out.println("Oyuncu bilgisi doðrulandý.");
			return true;
		}
		else {
		
			System.out.println("Oyuncu bilgisi doðrulanamadý.");
			return false;
		}
		
	}
	
	
	

}
