package teste;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, area;
		
		System.out.printf("Digite a base do tri�ngulo: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite a altura do tri�ngulo: ");
		b = ler.nextDouble();
				
		area = a * b ; 
	
	if (area <= 100) {
		System.out.printf("A �rea do tri�ngulo �: %.2f", area); }
	
	else {
		System.out.printf("Terreno grande"); }
	
	}
	}