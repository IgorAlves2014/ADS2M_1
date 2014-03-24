package MatchingGame;

public class Play {
	
	public static void main(String[] args) {
		GameController play = new GameController();


				while (! play.isOver()) {
					play.showStatus();
					play.realizaJogada();

		}
				play.mostraVencedor(play.vencedor());
				
	}

}
