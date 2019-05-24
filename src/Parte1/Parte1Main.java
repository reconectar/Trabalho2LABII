package Parte1;

import Parte2.Sorts;
import util.Timer;

public class Parte1Main {
	
	//JVM Run arguments -Xss256m para encerrar o problema do StackOverflow (demora demais porém)

	public static void main(String[] args) {
		
		int n = 25000; //Para definir o tamanho dos vetores //FIXME mudar para 10000000
		int []vetorCres = new int[n];
		int []vetorDecr = new int[n];
		int []vetorRand = new int[n];
		Sorts.limpaVetores(vetorCres, vetorDecr, vetorRand, n); // Preenche os vetores com os valores
		
		//Declarando as arvores
		CArvBin arvAbpCres= new CArvBin();
		CArvBin arvAbpDecr= new CArvBin();
		CArvBin arvAbpRand= new CArvBin();
		ArvoreAvl arvAvlCres= new ArvoreAvl();
		ArvoreAvl arvAvlDecr= new ArvoreAvl();
		ArvoreAvl arvAvlRand= new ArvoreAvl();
		
		//Insercao
		
			//Abp
		
		Timer insercaoTimerAbpCres = new Timer(); //Inicia o timer	
		for(int i = 0; i < n; i++) {
			arvAbpCres.put((vetorCres[i]));	//Insere os elementos na arvore		
		}
		String tempoAbpCresInsercao = insercaoTimerAbpCres.getTotalTime(); //Pega o tempo final total e armazena em uma String
		
		Timer insercaoTimerAbpDecr = new Timer();
		for(int i = 0; i < n; i++) {
			arvAbpDecr.put((vetorDecr[i]));			
		}
		String tempoAbpDecrInsercao = insercaoTimerAbpDecr.getTotalTime();
		
		Timer insercaoTimerAbpRand = new Timer();
		for(int i = 0; i < n; i++) {
			arvAbpRand.put((vetorRand[i]));			
		}
		String tempoAbpRandInsercao = insercaoTimerAbpRand.getTotalTime();
		
		Timer insercaoTimerAvlCres = new Timer();
		for(int i = 0; i < n; i++) {
			arvAvlCres.inserir((vetorCres[i]));			
		}
		
			//Avl
		
		String tempoAvlCresInsercao = insercaoTimerAvlCres.getTotalTime();
		
		Timer insercaoTimerAvlDecr = new Timer();
		for(int i = 0; i < n; i++) {
			arvAvlDecr.inserir((vetorDecr[i]));			
		}
		String tempoAvlDecrInsercao = insercaoTimerAvlDecr.getTotalTime();
		
		Timer insercaoTimerAvlRand = new Timer();
		for(int i = 0; i < n; i++) {
			arvAvlRand.inserir((vetorRand[i]));
		}
		String tempoAvlRandInsercao = insercaoTimerAvlRand.getTotalTime();
		
		//Consulta
			
			//Abp
		
		Timer consultaTimerAbpCres = new Timer(); //Inicia o timer	
		for(int i = 0; i < n; i++) {
			arvAbpCres.achou(vetorCres[i]);	//Insere os elementos na arvore		
		}
		String tempoAbpCresConsulta = consultaTimerAbpCres.getTotalTime(); //Pega o tempo final total e armazena em uma String
		
		Timer consultaTimerAbpDecr = new Timer(); //Inicia o timer	
		for(int i = 0; i < n; i++) {
			arvAbpDecr.achou(vetorDecr[i]);	//Insere os elementos na arvore		
		}
		String tempoAbpDecrConsulta = consultaTimerAbpDecr.getTotalTime(); //Pega o tempo final total e armazena em uma String
		
		Timer consultaTimerAbpRand = new Timer(); //Inicia o timer	
		for(int i = 0; i < n; i++) {
			arvAbpRand.achou(vetorRand[i]);	//Insere os elementos na arvore		
		}
		String tempoAbpRandConsulta = consultaTimerAbpRand.getTotalTime(); //Pega o tempo final total e armazena em uma String		
		
			//Avl
		
		Timer consultaTimerAvlCres = new Timer(); //Inicia o timer	
		for(int i = 0; i < n; i++) {
			arvAvlCres.achou(vetorCres[i]);	//Insere os elementos na arvore		
		}
		String tempoAvlCresConsulta = consultaTimerAvlCres.getTotalTime(); //Pega o tempo final total e armazena em uma String
		
		Timer consultaTimerAvlDecr = new Timer(); //Inicia o timer	
		for(int i = 0; i < n; i++) {
			arvAvlDecr.achou(vetorDecr[i]);	//Insere os elementos na arvore		
		}
		String tempoAvlDecrConsulta = consultaTimerAvlDecr.getTotalTime(); //Pega o tempo final total e armazena em uma String
		
		Timer consultaTimerAvlRand = new Timer(); //Inicia o timer	
		for(int i = 0; i < n; i++) {
			arvAvlRand.achou(vetorRand[i]);	//Insere os elementos na arvore		
		}
		String tempoAvlRandConsulta = consultaTimerAvlRand.getTotalTime(); //Pega o tempo final total e armazena em uma String		
		
		//Imprime os resultados
		System.out.println("Tempo ABP:");
		System.out.println();
		System.out.println("--Insercao--");
		System.out.println("Crescente: " + tempoAbpCresInsercao);
		System.out.println("Decrescente: " + tempoAbpDecrInsercao);
		System.out.println("Aleatorio: " + tempoAbpRandInsercao);
		System.out.println();
		System.out.println("--Consulta--");
		System.out.println("Crescente: " + tempoAbpCresConsulta);
		System.out.println("Decrescente: " + tempoAbpDecrConsulta);
		System.out.println("Aleatorio: " + tempoAbpRandConsulta);
		System.out.println();
		System.out.println("Tempo AVL:");
		System.out.println();
		System.out.println("--Insercao--");
		System.out.println("Crescente: " + tempoAvlCresInsercao);
		System.out.println("Decrescente: " + tempoAvlDecrInsercao);
		System.out.println("Aleatorio: " + tempoAvlRandInsercao);
		System.out.println();
		System.out.println("--Consulta--");
		System.out.println("Crescente: " + tempoAvlCresConsulta);
		System.out.println("Decrescente: " + tempoAvlDecrConsulta);
		System.out.println("Aleatorio: " + tempoAvlRandConsulta);
		
	}
}
