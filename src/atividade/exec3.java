package atividade;

import java.util.Scanner;

public class exec3 {
public static void main (String[] argS) {
Scanner scanner = new Scanner(System.in);

int salario;

System.out.println("digite o seu salario:");
double salario1 = scanner.nextDouble();

double descontoinss;

if(salario1 <= 600) {
double descontoinss1 = 0;
}
else if(salario1 > 600 && salario1 <= 1200) {
System.out.println("descontoinss = salario1 * 0.2");
}
else if (salario1 > 1200 && salario1 <= 2000) {
System.out.println("descontoinss = salario1 * 0.25");
}
if (salario1 > 2000) {
System.out.println("descontoinss = salario1 * 0.3");

}
}

	
	
	
	
	
	
	
	
	
	
}
	
	



