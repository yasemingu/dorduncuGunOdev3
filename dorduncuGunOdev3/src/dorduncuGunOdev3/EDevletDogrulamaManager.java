package dorduncuGunOdev3;

public class EDevletDogrulamaManager implements EDevletDogrulama{
	@Override
	public boolean gamerCheck(Gamer gamer) {
		if (gamer.getFirstName()=="Yasemin") {
			System.out.println("Oyuncu bilgisi doğrulandı.");
			return true;
		}
		else {
		
			System.out.println("Oyuncu bilgisi doğrulanamadı.");
			return false;
		}
		
	}
	
	
	

}
