package CintiaAC3;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class CintiaAC3 {
	
	public static void exibeVetor(int[] v) {
		System.out.println("Elementos do vetor:");
		for (int i=0; i < v.length; i++) {
			System.out.print(v[i] + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ArrayBlockingQueue<Integer> filaPositivo = new ArrayBlockingQueue<Integer>(10);
		Stack <Integer> pilhaNegativo = new Stack<Integer>();
		
		int[] v = new int[10];
		
		for (int i=0; i < v.length; i++) {
			System.out.println("Digite um número");
			v[i] = leitor.nextInt();
		}
		
		//exibeVetor(v); 
		
		for (int i = 0; i < v.length; i++) {
			if(v[i] > 0) {
				filaPositivo.add(v[i]);
			}
				
		}
		
		for (int i = 0; i < v.length; i++) {
			if(v[i] < 0) {
				pilhaNegativo.push(v[i]);
			}
				
		}
		
		System.out.print(filaPositivo);
		System.out.println(pilhaNegativo);
		
		
		//Esvaziando a pilha e a fila
		while (filaPositivo.size() > 0) {
			System.out.println("Removendo elementos da fila: "+filaPositivo.poll());
		}
		while (!pilhaNegativo.isEmpty()) {
			System.out.println("Desempilhando elementos da pilha: " + pilhaNegativo.pop());
		}
	
//		System.out.print(filaPositivo);
//		System.out.println(pilhaNegativo);
		
		
	}
	
}
