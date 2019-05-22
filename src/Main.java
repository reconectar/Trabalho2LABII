import java.util.Random;

public class Main {	

	public static void main(String[] args) {
		Random random = new Random();
		int []vetorCres = new int[10000000];
		int []vetorDecr = new int[10000000];
		int []vetorRand = new int[10000000];
		for(int i = 0; i < 10000000; i++) {
			vetorCres[i] = i+1;
			vetorDecr[i] = vetorDecr.length - (i); 
			vetorRand[i] = random.nextInt(1000);
		}		
		ArvoreAvl arvAvlCres= new ArvoreAvl();
		CArvBin arvAbpCres= new CArvBin();
		ArvoreAvl arvAvlDecr= new ArvoreAvl();
		CArvBin arvAbpDecr= new CArvBin();
		ArvoreAvl arvAvlRand= new ArvoreAvl();
		CArvBin arvAbpRand= new CArvBin();
		
		Timer timerAbpCres = new Timer();
		for(int i = 0; i < 10000000; i++) {
			arvAbpCres.put((vetorCres[i]), null);			
		}
		long tempoAbpCres = timerAbpCres.getTotalTimeInMillis();
		
		Timer timerAbpDecr = new Timer();
		for(int i = 0; i < 10000000; i++) {
			arvAbpCres.put((vetorCres[i]), null);			
		}
		long tempoAbpDecr = timerAbpDecr.getTotalTimeInMillis();	
		
		arvAvlCres(vetorCres[i]);
		arvAbpDecr(vetorDecr[i]);
		arvAvlDecr(vetorDecr[i]);
		arvAbpRand(vetorRand[i]);
		arvAvlRand(vetorRand[i]);
	}
}
