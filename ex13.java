package teste;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double a, b, c;
	
	System.out.printf("Digite o primeiro n�mero: ");
	a = ler.nextDouble();
	
	System.out.printf("Digite o segundo n�mero ");
	b = ler.nextDouble();
	
	System.out.printf("Digite o terceiro n�mero ");
	c = ler.nextDouble();
	
	if ((a > b) && (a > c)) {
		System.out.printf("O n�mero %.1f � o maior!", a); } 
	
	else if ((c > a) && (c > b)) {
		System.out.printf("O n�mero %.1f � o maior!", c); }
	
	else {
				System.out.printf("O n�mero %.1f � o maior!", b); }
	
	}
	}