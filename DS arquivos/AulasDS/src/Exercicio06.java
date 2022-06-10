import java.util.Scanner;
public class Exercicio06 {
	public static void main(String args[]) {
		int idade, dias;
		Scanner leia;
		
		System.out.println("Digite a sua idade: ");
		leia = new Scanner(System.in);
		idade = leia.nextInt();
		
		dias = idade * 365;
		
		System.out.println("Vove viveu o total de: "+ dias+ " dias!");
	
	}
	
}
