package teste;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double a, b, c, d, media ;
		
		System.out.printf("Digite o valor do primeiro n�mero: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo n�mero: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro n�mero: ");
		c = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto n�mero: ");
		d = ler.nextDouble();
		
		media = (a + b + c + d)/ 4 ; 
		
		System.out.printf("A m�dia aritim�tica desses n�meros � %.2f.", media);

	}

}