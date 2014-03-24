package Trabalho2;

import java.util.Random;

public class Principal_Controle {

	Pessoa_Model pessoa = new Pessoa_Model();
	Telefone telefone=new Telefone();
	Show_View show=new Show_View();


	Random gerador=new Random();

	Pessoa_Model[] vetorPessoa=new Pessoa_Model[50];
	Telefone[] vetorNumeros=new Telefone[50];
	Nome[] vetorNomes=new Nome[50];
	Endereco[] vetorEndereco=new Endereco[50];


void criaContatos(){

for(int i=0;i<50;i++){
	vetorPessoa[i]=new Pessoa_Model();
	vetorNumeros[i]=new Telefone();
	vetorNomes[i]=new Nome();
	vetorEndereco[i]=new Endereco();

	
	String tempNomes[]={ " Jose" , " Bob " , " Carlos " , " Daniela " , " Victor " , 
	" Fabiana " , "Rafael" , " David " , " Fabiano " , " Fernanda " , " Fernando " ,
	" Ferreira "	, " Gomes " , " Cristiane " , " Thomas " , " Thiago " , " Matheus " ,
	" Marcos " , " Marciel " , " Mendes " , " Mauro " , " Aumir " , " Rui " ,
	" Ronaldo " , " Renata " , " Nathalia " , " Beker " , " Juliano " , " joão " , 
	" Jonathas " , " Anna " , " Julia " , " Rafaela " , " Kelym " , " Kamila " ,
	" Cyntia " , " Silvia " , " Solange " , " Fabricia " , " Amanda " , "  Aline " ,
	" Brunna " , " Bianca " , " Raquel " , " Tatiana " ," Thais " , " Dandara " ,
	" Patricia " , " Caroline " , " Natasha "};
	String temp7 = (tempNomes[new Random().nextInt(tempNomes.length)]);
	
	vetorNomes[i].setNome(temp7);
	


	
	int temp8=gerador.nextInt();
	String temp9= (tempNomes[new Random().nextInt(tempNomes.length)]);
	String numero_da_casa = Integer.toString(temp8).substring(1, 3);
	String rua = temp9;
	String endereco = "Rua" + rua + " Numero: " + numero_da_casa ;
	
	vetorEndereco[i].setEndereco(endereco);
	



	
	int temp1=gerador.nextInt();
	int temp2=gerador.nextInt();
	String metade1 = Integer.toString(temp1).substring(1, 4);
	String metade2 = Integer.toString(temp2).substring(1, 5);
	String casa;
	casa = metade1 + "-" + metade2;
	vetorNumeros[i].setCasa(casa);

	
	int temp3=gerador.nextInt();
	int temp4=gerador.nextInt();
	String metade3 = Integer.toString(temp3).substring(1, 4);
	String metade4 = Integer.toString(temp4).substring(1, 5);
	String celular;
	celular = metade3 + "-" + metade4;
	vetorNumeros[i].setCelular(celular);

	
	int temp5=gerador.nextInt();
	int temp6=gerador.nextInt();
	String metade5 = Integer.toString(temp5).substring(1, 4);
	String metade6 = Integer.toString(temp6).substring(1, 5);
	String trabalho;
	trabalho = metade5 + "-" + metade6;
	vetorNumeros[i].setTrabalho(trabalho);

	
	vetorPessoa[i].setNumero(vetorNumeros[i]);
	


}
}




void mostraContatos(){

	for(int y=0;y<50;y++){
	
	show.Show(vetorNomes[y].nome , vetorEndereco[y].Endereco,
			vetorNumeros[y].casa, vetorNumeros[y].celular , vetorNumeros[y].trabalho);
}
}

}
