import java.util.Scanner;
public class Exercicio07 {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		float desconto, valor, vd;
		Scanner sc;
		
		System.out.println("digite o valor do produto: ");
		sc = new Scanner(System.in);
		valor = sc.nextFloat();
		
		System.out.println("digite o valor do desconto(em porcentagem): ");
		sc = new Scanner(System.in);
		desconto = sc.nextFloat();
		
		vd = (valor * desconto) / 100;
		
		System.out.println("O valor do produto é: " + valor + "! Com o desconto é: " + (valor - vd));
		
		
		
	} 

}
