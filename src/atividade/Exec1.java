package atividade;

import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int valor1 = scanner.nextInt();

		if (valor1 > 20) {
			int divisao = valor1 / 2;
			System.out.println("O valor da divisao e: " + divisao);
		} else {
			System.out.println("O valor e menor do que o esperado");
		}

	}

}
