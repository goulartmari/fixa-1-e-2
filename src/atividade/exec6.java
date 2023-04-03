package atividade;

import java.util.Scanner;

public class exec6 {
public static void main (String[] argS) {
Scanner scanner = new Scanner(System.in);

 int valor1, valor2; 
 System.out.println("digite o primeiro numero:");
 valor1 = scanner.nextInt();
 
 System.out.println("digite o segundo numero:");
 valor2 = scanner.nextInt();
 
 if (valor1 == valor2) {
	 System.out.println("os numeros sao iguais.");
	 
 }
 else if (valor1 > valor2) {
	 System.out.println("o valor um e maior que o valor dois\n");
 }
 else if (valor1 < valor2) {
	 System.out.println("o valor um e menor que o valor dois\n");
 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
