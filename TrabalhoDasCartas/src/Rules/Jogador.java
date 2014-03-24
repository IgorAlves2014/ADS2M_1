package Rules;

public class Jogador {
	
	
		private int pontos;
			String jogador;



			public Jogador() {
				pontos = 0;
			}

			public int getPontos() {
				return pontos;
			}
			
			public void addPontos(int pontos) {
				this.pontos += pontos;
			}
			
			public void subtractPontos(int pontos) {
				this.pontos -= pontos;
			}

			public String getJogador() {
				return jogador;
			}

			public void setJogador(String jogador) {
				this.jogador = jogador;
				
	}

}
