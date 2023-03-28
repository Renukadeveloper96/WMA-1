package oops;

public class ChessGame implements GamingConsole{

	
  public ChessGame() {
	  System.out.println("chess game");
  }

@Override
public void up() {
	System.out.println("chess game up");	
}

@Override
public void down() {
	System.out.println("chess game down");
	
}

}
