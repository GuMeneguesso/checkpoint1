package teste;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double cotação, dol, reais ;
		
		System.out.printf("Digite o valor da cotação do dolar atual: ");
		cotação = ler.nextDouble();
		
		System.out.printf("Digite a quantidade de dolar que deseja converter para reais: ");
		dol = ler.nextDouble();
		
		reais = dol * cotação ;
		
		System.out.printf("%.2f dolares equivale à %.2f reais.", dol, reais);

	}

}