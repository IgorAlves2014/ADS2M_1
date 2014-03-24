package MatchingGame;

import java.util.Scanner;

import Cartas.Carta;
import Rules.Jogador;



import static java.lang.System.out;

public class GameView {
	
	private Scanner teclado = new Scanner(System.in);
	private Scanner teclado1 = new Scanner(System.in);


	public void nomeJogador(int nome){
		System.out.println("_____________________");
		System.out.println("Jogador: "+nome);
	}
	public void corrige(){
		System.out.println("Escolha somente 1 ou 2!");
	}
	public void mostraVencedor(int vencedor){
		System.out.println("Vencedor:\nJogador: "+vencedor);
	}

	public void passarVez(int nome){
		System.out.println("Jogador "+nome+" passou a vez");
	}
	public int entraJogadores(){

		System.out.println("Informe o numero de jogadores:");
		int numero=teclado.nextInt();
		return numero;

	}

	public int getUserInput()
	{	

		System.out.println("1 - Jogar;\n2 - Passar a vez;");
		return teclado1.nextInt();
	}

	public void mostraCarta(Carta carta) {
		out.println(String.format("%nCarta: %d%c",
				                  carta.getNumero(),
				                  carta.getNaipe()));
	}

	public void mostraJogador(Jogador jogador) {
		out.println(String.format("Pontos: %d",
				                  jogador.getPontos()));

	}
	
	

}
