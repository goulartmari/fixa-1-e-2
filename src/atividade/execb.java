package atividade;

import java.util.Scanner;

public class execb {

public static void main (String[] argS) {
	
Scanner scanner = new Scanner(System.in);

int n;

System.out.println("digite a quantidade de numero:");
n = scanner.nextInt();

int[] numeros = new int [n];

for (int i =0; i < n; i++) {
	System.out.println("digite o" + (i + 1) + "numero:");
	numeros [i] = scanner.nextInt();
}
for (int i = 0; i < n; i ++) {
	if (numeros [i] > 0) {
		System.out.println(numeros [i] + "e positivo");
	} else if (numeros [i] < 0) {
		System.out.println(numeros [i] + "e negativo");
	} else { 
		System.out.println("o numero e zero");
	}
}
	
	
	
	
	
	
	
}
}
