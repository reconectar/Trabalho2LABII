package Parte2;

import util.Timer;

public class Parte2Main {
	
	//JVM Run arguments -Xss256m para encerrar o problema do StackOverflow

	public static void main(String[] args) {
		int n = 100000;
		int[] vetorCres = new int[n];
		int[] vetorDecr = new int[n];
		int[] vetorRand = new int[n];
		Sorts.limpaVetores(vetorCres, vetorDecr, vetorRand, n); // Preenche os vetores com os valores

		Timer timerBubbleCres = new Timer();
		Sorts.bubbleSort(vetorCres);
		String tempoBubbleCres = timerBubbleCres.getTotalTime();

		Timer timerBubbleDecr = new Timer();
		Sorts.bubbleSort(vetorDecr);
		String tempoBubbleDecr = timerBubbleDecr.getTotalTime();

		Timer timerBubbleRand = new Timer();
		Sorts.bubbleSort(vetorRand);
		String tempoBubbleRand = timerBubbleRand.getTotalTime();

		Sorts.limpaVetores(vetorCres, vetorDecr, vetorRand, n); // Reseta os vetores pra fazer os novos testes

		Timer timerInsertCres = new Timer();
		Sorts.insertSort(vetorCres);
		String tempoInsertCres = timerInsertCres.getTotalTime();

		Timer timerInsertDecr = new Timer();
		Sorts.insertSort(vetorDecr);
		String tempoInsertDecr = timerInsertDecr.getTotalTime();

		Timer timerInsertRand = new Timer();
		Sorts.insertSort(vetorRand);
		String tempoInsertRand = timerInsertRand.getTotalTime();

		Sorts.limpaVetores(vetorCres, vetorDecr, vetorRand, n); // Reseta os vetores pra fazer os novos testes

		Timer timerSelectionCres = new Timer();
		Sorts.selectionSort(vetorCres);
		String tempoSelectionCres = timerSelectionCres.getTotalTime();

		Timer timerSelectionDecr = new Timer();
		Sorts.selectionSort(vetorDecr);
		String tempoSelectionDecr = timerSelectionDecr.getTotalTime();

		Timer timerSelectionRand = new Timer();
		Sorts.selectionSort(vetorRand);
		String tempoSelectionRand = timerSelectionRand.getTotalTime();

		Sorts.limpaVetores(vetorCres, vetorDecr, vetorRand, n); // Reseta os vetores pra fazer os novos testes

		Timer timerMergeCres = new Timer();
		Sorts.mergeSort(vetorCres);
		String tempoMergeCres = timerMergeCres.getTotalTime();

		Timer timerMergeDecr = new Timer();
		Sorts.mergeSort(vetorDecr);
		String tempoMergeDecr = timerMergeDecr.getTotalTime();

		Timer timerMergeRand = new Timer();
		Sorts.mergeSort(vetorRand);
		String tempoMergeRand = timerMergeRand.getTotalTime();

		Sorts.limpaVetores(vetorCres, vetorDecr, vetorRand, n); // Reseta os vetores pra fazer os novos testes

		Timer timerQuickCres = new Timer();
		Sorts.quickSort(vetorCres);
		String tempoQuickCres = timerQuickCres.getTotalTime();

		Timer timerQuickDecr = new Timer();
		Sorts.quickSort(vetorDecr);
		String tempoQuickDecr = timerQuickDecr.getTotalTime();

		Timer timerQuickRand = new Timer();
		Sorts.quickSort(vetorRand);
		String tempoQuickRand = timerQuickRand.getTotalTime();

		Sorts.limpaVetores(vetorCres, vetorDecr, vetorRand, n); // Reseta os vetores pra fazer os novos testes

		Timer timerShellCres = new Timer();
		Sorts.shellSort(vetorCres);
		String tempoShellCres = timerShellCres.getTotalTime();

		Timer timerShellDecr = new Timer();
		Sorts.shellSort(vetorDecr);
		String tempoShellDecr = timerShellDecr.getTotalTime();

		Timer timerShellRand = new Timer();
		Sorts.shellSort(vetorRand);
		String tempoShellRand = timerShellRand.getTotalTime();

		// Imprime os resultados
		System.out.println("Tempo Bubble:");
		System.out.println("Crescente: " + tempoBubbleCres);
		System.out.println("Decrescente: " + tempoBubbleDecr);
		System.out.println("Aleatorio: " + tempoBubbleRand);
		System.out.println();
		System.out.println("Tempo Insert:");
		System.out.println("Crescente: " + tempoInsertCres);
		System.out.println("Decrescente: " + tempoInsertDecr);
		System.out.println("Aleatorio: " + tempoInsertRand);
		System.out.println();
		System.out.println("Tempo Selection:");
		System.out.println("Crescente: " + tempoSelectionCres);
		System.out.println("Decrescente: " + tempoSelectionDecr);
		System.out.println("Aleatorio: " + tempoSelectionRand);
		System.out.println();
		System.out.println("TempoMerge:");
		System.out.println("Crescente: " + tempoMergeCres);
		System.out.println("Decrescente: " + tempoMergeDecr);
		System.out.println("Aleatorio: " + tempoMergeRand);
		System.out.println();
		System.out.println("Tempo Quick:");
		System.out.println("Crescente: " + tempoQuickCres);
		System.out.println("Decrescente: " + tempoQuickDecr);
		System.out.println("Aleatorio: " + tempoQuickRand);
		System.out.println();
		System.out.println("Tempo Shell:");
		System.out.println("Crescente: " + tempoShellCres);
		System.out.println("Decrescente: " + tempoShellDecr);
		System.out.println("Aleatorio: " + tempoShellRand);
		System.out.println();
	}
}
