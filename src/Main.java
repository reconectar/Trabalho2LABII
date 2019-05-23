package trabalhoLAB2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int []vetorCres = new int[25000];
		int []vetorDecr = new int[25000];
		int []vetorRand = new int[25000];
		for(int i = 0; i < 25000; i++) {
			vetorCres[i] = i+1;
			vetorDecr[i] = vetorDecr.length - (i); 
			vetorRand[i] = random.nextInt(25000);
		}		
		CArvBin arvAbpCres= new CArvBin();
		CArvBin arvAbpDecr= new CArvBin();
		CArvBin arvAbpRand= new CArvBin();
		ArvoreAvl arvAvlCres= new ArvoreAvl();
		ArvoreAvl arvAvlDecr= new ArvoreAvl();
		ArvoreAvl arvAvlRand= new ArvoreAvl();
		
		
		Timer timerAbpCres = new Timer();
		for(int i = 0; i < 25000; i++) {
			arvAbpCres.put((vetorCres[i]));			
		}
		long tempoAbpCres = timerAbpCres.getTotalTimeInMillis();
		
		Timer timerAbpDecr = new Timer();
		for(int i = 0; i < 25000; i++) {
			arvAbpDecr.put((vetorDecr[i]));			
		}
		long tempoAbpDecr = timerAbpDecr.getTotalTimeInMillis();
		
		Timer timerAbpRand = new Timer();
		for(int i = 0; i < 25000; i++) {
			arvAbpRand.put((vetorRand[i]));			
		}
		long tempoAbpRand = timerAbpRand.getTotalTimeInMillis();
		
		Timer timerAvlCres = new Timer();
		for(int i = 0; i < 25000; i++) {
			arvAvlCres.inserir((vetorCres[i]));			
		}
		long tempoAvlCres = timerAvlCres.getTotalTimeInMillis();
		
		Timer timerAvlDecr = new Timer();
		for(int i = 0; i < 25000; i++) {
			arvAvlDecr.inserir((vetorDecr[i]));			
		}
		long tempoAvlDecr = timerAvlDecr.getTotalTimeInMillis();
		
		Timer timerAvlRand = new Timer();
		for(int i = 0; i < 25000; i++) {
			arvAvlRand.inserir((vetorRand[i]));			
		}
		long tempoAvlRand = timerAvlRand.getTotalTimeInMillis();
		
		System.out.println("Tempo ABP:");
		System.out.println("Crescente: " + tempoAbpCres);
		System.out.println("Decrescente: " + tempoAbpDecr);
		System.out.println("Aleatório: " + tempoAbpRand);
		System.out.println("Tempo AVL:");
		System.out.println("Crescente: " + tempoAvlCres);
		System.out.println("Decrescente: " + tempoAvlDecr);
		System.out.println("Aleatório: " + tempoAvlRand);
	}
}
