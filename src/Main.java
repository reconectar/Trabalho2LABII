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
	}
}
