package teste;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double a, b;
	
	System.out.printf("Digite o segundo n�mero: ");
	a = ler.nextDouble();
	
	System.out.printf("Digite o primeiro n�mero ");
	b = ler.nextDouble();
	
	if (a > b) {
		System.out.printf("O numero %.1f � o maior!", a); 
	
	} else if (a == b) {
		System.out.printf("Os n�meros s�o iguais!", b); }
	
	else {
		System.out.printf("O numero %.1f � o maior!", b); 
	}
	}
	}