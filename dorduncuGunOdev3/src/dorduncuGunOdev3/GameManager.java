package dorduncuGunOdev3;

public class GameManager extends Game implements GameService {

	

@Override
public void add(Gamer gamer, Game game) {
	System.out.println(gamer.getFirstName() + " adlý oyuncu" + game.getGameName() + " adlý oyunu "
			+ "sepete ekledi.");
	
}

@Override
public void remove(Gamer gamer, Game game) {
	System.out.println(gamer.getFirstName() + " adlý oyuncu" + game.getGameName() + " adlý oyunu "
			+ "sepetten çýkardý.");
		
	}
@Override
public void end(Gamer gamer, Game game) {
	System.out.println(gamer.getFirstName() + " adlý oyuncu" + game.getGameName() + " adlý oyunu "
			+ "satýn aldý.");
		
	}
}
