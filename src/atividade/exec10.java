package atividade;

import java.util.Scanner;

public class exec10 {
private static final String M = null;
private static final String F = null;

public static void main (String[] argS) {
Scanner scanner = new Scanner(System.in);

System.out.println("digite a sua altura:");
Double altura = scanner.nextDouble();

System.out.println("digite seu sexo (M ou F):");
String sexo = scanner.next();

double pesoideal = 0;

if (sexo.equalsIgnoreCase(M)){
	pesoideal = (72.7* altura) -58;
} else if (sexo.equalsIgnoreCase(F)){
	pesoideal = (62.1* altura) - 44.7;
}else {
	System.out.println("sexo invalido!");
	System.exit(0);
}
System.out.println("pesoideal e %.2f kg.");

scanner.close();

	
	
	
	
}

}


