import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args) {
		float ctemp, fah;
		Scanner leia;
		
		System.out.println("Digite a temperatura em celsius: ");
		leia = new Scanner(System.in);
		ctemp= leia.nextFloat();
		
		fah = (ctemp * 9/5) + 32;
		
		System.out.println("A temperatura em fahrenheit é: "+ fah);
		
	} 
	
}
