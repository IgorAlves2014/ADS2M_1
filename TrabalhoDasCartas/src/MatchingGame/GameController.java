package MatchingGame;



import Cartas.Baralho;

import Cartas.Carta;

import Rules.Jogador;

import Rules.MatchingGame;




public class GameController {
	
	Baralho baralho = new Baralho();
	MatchingGame game = new MatchingGame(baralho.drawCarta());

	GameView view=new GameView();
	//..............Quantidade de jogadores é informado no inicio........
	Jogador[] jogador=new Jogador[view.entraJogadores()];
	//...................................................................

	int quantidade = jogador.length;
	Jogador[] somapontos=new Jogador[4];

public void realizaJogada() {


	for(int i=0;i<quantidade;i++){

		int x = view.getUserInput();
			//............condição que verifica se o baralho acabou...........
			if(! isOver()){
			//................................................................	
				jogador[i]=new Jogador();

			switch(x){
			case 1 ://..Jogar

				int nome = i;

				jogador[i]=new Jogador();
				somapontos[i]=new Jogador();

				Carta comprada = baralho.drawCarta();
				view.mostraCarta(comprada);
				int score = game.matchCards(comprada);
				jogador[i].addPontos(score);

				game.setMesa(comprada);

				view.nomeJogador(nome);
				view.mostraJogador(jogador[i]);

				break;


			case 2 ://..Passsar

				view.passarVez(i);
				jogador[i].subtractPontos(1);

				break;
			//..............Mensagem de aviso 1 e 2............................
			default:view.corrige();

			}//switch	
		}//for	
	}//if
}//realizaJogada

//...............O Jogador com mais pontos no final do jogo...........
public int vencedor(){
	int maior = -200;
	int vencedor=0;

	for(int i=0;i<jogador.length;i++){
		if (jogador[i].getPontos()>maior){
			maior=jogador[i].getPontos();
			vencedor = i;
		}
	}
	return vencedor;
}

public void mostraVencedor(int vencedor){
	view.mostraVencedor(vencedor);
}

public void showStatus(){
	view.mostraCarta(game.getMesa());
}

public boolean isOver() {
	return baralho.isEmpty();
}

}//Class

