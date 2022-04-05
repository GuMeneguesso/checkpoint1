package teste;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double a, b;
	
	System.out.printf("Digite o primeiro número: ");
	a = ler.nextDouble();
	
	System.out.printf("Digite o segundo número ");
	b = ler.nextDouble();
	
	if (a > b) {
		System.out.printf("O número %.1f é o maior!", a); 
		} else {
		System.out.printf("O número %.1f é o maior!", b); }
	
	}
	}