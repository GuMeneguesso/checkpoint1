package teste;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double cota��o, dol, reais ;
		
		System.out.printf("Digite o valor da cota��o do dolar atual: ");
		cota��o = ler.nextDouble();
		
		System.out.printf("Digite a quantidade de dolar que deseja converter para reais: ");
		dol = ler.nextDouble();
		
		reais = dol * cota��o ;
		
		System.out.printf("%.2f dolares equivale � %.2f reais.", dol, reais);

	}

}