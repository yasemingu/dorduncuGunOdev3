package dorduncuGunOdev3;

public class GameManager extends Game implements GameService {

	

@Override
public void add(Gamer gamer, Game game) {
	System.out.println(gamer.getFirstName() + " adl� oyuncu" + game.getGameName() + " adl� oyunu "
			+ "sepete ekledi.");
	
}

@Override
public void remove(Gamer gamer, Game game) {
	System.out.println(gamer.getFirstName() + " adl� oyuncu" + game.getGameName() + " adl� oyunu "
			+ "sepetten ��kard�.");
		
	}
@Override
public void end(Gamer gamer, Game game) {
	System.out.println(gamer.getFirstName() + " adl� oyuncu" + game.getGameName() + " adl� oyunu "
			+ "sat�n ald�.");
		
	}
}
