package teste;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double base,alt,area;
		
		System.out.printf("Digite o valor da base do tri�gulo: ");
		base = ler.nextDouble();
		
		System.out.printf("Digite o valor da altura do tri�ngulo: ");
		alt = ler.nextDouble();
		
		area = base * alt / 2 ; 
		
		System.out.printf("A �rea de seu tri�ngulo � %.2f", area);

	}

}