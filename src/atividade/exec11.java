package atividade;

import java.util.Scanner;

public class exec11 {

public static void main (String [] argS) {
Scanner scanner = new Scanner (System.in);

System.out.println("digite seu salario bruto:");
double salariobruto = scanner.nextDouble();

System.out.println("digite o valor da prestacao:");
double prestacao = scanner.nextDouble();

if (prestacao <= salariobruto * 0.3) {
	System.out.println("emprestimo pode ser concedido.");
} else { 
	System.out.println("emprestimo nao pode ser concedido");
}
}

	
	
	
	
	
	
	
	
	
	
}


