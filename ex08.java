package teste;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double a, b;
	
	System.out.printf("Digite o primeiro n�mero: ");
	a = ler.nextDouble();
	
	System.out.printf("Digite o segundo n�mero ");
	b = ler.nextDouble();
	
	if (a > b) {
		System.out.printf("O n�mero %.1f � o maior!", a); 
		} else {
		System.out.printf("O n�mero %.1f � o maior!", b); }
	
	}
	}