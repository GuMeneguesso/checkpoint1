package teste;import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double c,f;
		
		System.out.printf("Digite quantos graus Celsius voc� quer converter para Fahrenheit: ");
		c = ler.nextDouble();
		
		f = (c * 1.8 )+ 32;
		
		System.out.printf("%.1f �C equivale � %.1f F", c, f);
		

	}

}
