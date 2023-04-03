package atividade;

import java.util.Scanner;

public class exec9 {
public static void main (String[] args) {
Scanner scanner = new Scanner(System.in); 
Double salario, bonus;
int anostrabalhados = 0; 

System.out.println("digite o salario do funcionario: R$");
salario = scanner.nextDouble();

if (anostrabalhados >= 5) {
	bonus = salario * 0.2;
} else { 
	bonus = salario * 0.1;
}

System.out.println("o valor do bonus e de R$%.2f");

scanner.close();
	
	
}
}

