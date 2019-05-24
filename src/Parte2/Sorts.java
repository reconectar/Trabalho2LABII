package Parte2;

import java.util.Random;

public final class Sorts {

	// Preenche os vetores com os valores
	public static void limpaVetores(int[] vetorCres, int[] vetorDecr, int[] vetorRand, int n) {
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			vetorCres[i] = i + 1;
			vetorDecr[i] = vetorDecr.length - (i);
			vetorRand[i] = random.nextInt(1000);
		}
	}

	// Imprimir Vetor
	public static void printvet(int vet[]) {
		int n = vet.length;
		for (int i = 0; i < n; i++) {
			System.out.println(vet[i]);
		}
	}

	// Bubble classico
	public static void bubbleSort(int vet[]) {
		int aux = 0;
		int n = vet.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
	}

	// Insercao
	public static void insertSort(int vet[]) {
		int n = vet.length;
		for (int i = 1; i < n; ++i) {
			int key = vet[i];
			int j = i - 1;
			while (j >= 0 && vet[j] > key) {
				vet[j + 1] = vet[j];
				j = j - 1;
			}
			vet[j + 1] = key;
		}
	}

	// Selecao
	public static void selectionSort(int[] vet) {
		for (int fixo = 0; fixo < vet.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vet.length; i++) {
				if (vet[i] < vet[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = vet[fixo];
				vet[fixo] = vet[menor];
				vet[menor] = t;
			}
		}
	}

	// Merge
	public static void mergeSort(int[] vet) {
		mergeSortRec(vet, vet.length);
	}

	private static void mergeSortRec(int[] vet, int n) {
		if (n < 2)
			return;
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = vet[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = vet[i];
		}
		mergeSortRec(l, mid);
		mergeSortRec(r, n - mid);

		merge(vet, l, r, mid, n - mid);
	}

	private static void merge(int[] vet, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;

		while (i < left && j < right) {

			if (l[i] <= r[j])
				vet[k++] = l[i++];
			else
				vet[k++] = r[j++];

		}

		while (i < left)
			vet[k++] = l[i++];

		while (j < right)
			vet[k++] = r[j++];
	}

	// Quick
	public static void quickSort(int[] vet) {
		quickSortRec(vet, 0, vet.length - 1);
	}

	private static void quickSortRec(int[] vet, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vet, inicio, fim);
			quickSortRec(vet, inicio, posicaoPivo - 1);
			quickSortRec(vet, posicaoPivo + 1, fim);
		}
	}

	private static int separar(int[] vet, int inicio, int fim) {
		int pivo = vet[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vet[i] <= pivo)
				i++;
			else if (pivo < vet[f])
				f--;
			else {
				int troca = vet[i];
				vet[i] = vet[f];
				vet[f] = troca;
				i++;
				f--;
			}
		}
		vet[inicio] = vet[f];
		vet[f] = pivo;
		return f;
	}

	// Shell
	public static void shellSort(int[] vet) {
		int increment = vet.length / 2;
		while (increment > 0) {
			for (int i = increment; i < vet.length; i++) {
				int j = i;
				int temp = vet[i];
				while (j >= increment && vet[j - increment] > temp) {
					vet[j] = vet[j - increment];
					j = j - increment;
				}
				vet[j] = temp;
			}
			if (increment == 2) {
				increment = 1;
			} else {
				increment *= (5.0 / 11);
			}
		}
	}
}
