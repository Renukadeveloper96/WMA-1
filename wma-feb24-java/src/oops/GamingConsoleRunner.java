package oops;

public class GamingConsoleRunner {

	public static void main(String[] args) {
		GamingConsole[] games= { new ChessGame(),new MicroGame()};
		for(GamingConsole game:games) {
//			game.up();
			game.down();
		}

	}

}
