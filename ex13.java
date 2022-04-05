package teste;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double a, b, c;
	
	System.out.printf("Digite o primeiro número: ");
	a = ler.nextDouble();
	
	System.out.printf("Digite o segundo número ");
	b = ler.nextDouble();
	
	System.out.printf("Digite o terceiro número ");
	c = ler.nextDouble();
	
	if ((a > b) && (a > c)) {
		System.out.printf("O número %.1f é o maior!", a); } 
	
	else if ((c > a) && (c > b)) {
		System.out.printf("O número %.1f é o maior!", c); }
	
	else {
				System.out.printf("O número %.1f é o maior!", b); }
	
	}
	}