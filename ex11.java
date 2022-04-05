package teste;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, area;
		
		System.out.printf("Digite a base do triângulo: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite a altura do triângulo: ");
		b = ler.nextDouble();
				
		area = a * b ; 
	
	if (area <= 100) {
		System.out.printf("A área do triângulo é: %.2f", area); }
	
	else {
		System.out.printf("Terreno grande"); }
	
	}
	}