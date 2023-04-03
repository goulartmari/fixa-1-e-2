package atividade;

import java.util.Scanner;

public class execa {

public static void main(String[] argS) {
	
Scanner scanner = new Scanner(System.in);	
	
System.out.println("digite um numero inteiro entre 1 e 12:");
int numero = scanner.nextInt();

if (numero == 1) {
System.out.println("janeiro!/n");

}else if (numero == 2) {
System.out.println("fevereiro!/n");
}else if (numero == 3) {
System.out.println("março!/n");
}else if (numero == 4) {
System.out.println("abril!/n");
}else if (numero == 5) {
System.out.println("maio!/n");	
}else if (numero == 6) {
System.out.println("junho!/n");
}else if (numero == 7) {
System.out.println("julho!/n");
}else if (numero == 8) {
System.out.println("agosto!/n");
}else if (numero == 9) {
System.out.println("setembro/n");
}else if (numero == 10) {
System.out.println("outubro/n");
}else if (numero == 11) {
System.out.println("novembro/n");
}else if (numero == 12) {
} else {
System.out.println("numero invalido!/n");
}
}
}
