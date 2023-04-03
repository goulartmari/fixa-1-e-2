package atividade;

import java.util.Scanner;

public class exec8 {
public static void main (String[] argS) {
Scanner scanner = new Scanner(System.in);

System.out.println("digite a idade da pessoa:");
int idade = scanner.nextInt();

if (idade >=18 ) {
System.out.println("a pessoa e maior de idade.");
} else {
	System.out.println("a pessoa nao e maior de idade");
}
	
	scanner.close();
	
	
	
	
	
}
}
