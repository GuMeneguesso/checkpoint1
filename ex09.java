package teste;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double a, b;
	
	System.out.printf("Digite o primeiro número: ");
	a = ler.nextDouble();
	
	System.out.printf("Digite o segundo número ");
	b = ler.nextDouble();
	
	if (a < b) {
		System.out.printf("O numero %.1f é o menor!", a); 
	
	} else {
		System.out.printf("O numero %.1f é o menor!", b); 
	}
	}
}