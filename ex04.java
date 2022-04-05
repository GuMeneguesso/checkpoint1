package teste;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double a, b, c, d, media ;
		
		System.out.printf("Digite o valor do primeiro número: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo número: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro número: ");
		c = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto número: ");
		d = ler.nextDouble();
		
		media = (a + b + c + d)/ 4 ; 
		
		System.out.printf("A média aritimética desses números é %.2f.", media);

	}

}