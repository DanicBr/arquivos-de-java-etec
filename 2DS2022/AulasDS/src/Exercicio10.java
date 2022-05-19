import java.util.Scanner;
import java.util.Calendar;

public class Exercicio10 {
	public static void main(String [] args) {
		Scanner leia;
		Calendar data = Calendar.getInstance();
		int anoN, mesN, diaN;
		int anoH, diaH, mesH;
		int dias;
		
		
		System.out.println("Digite o seu dia de nascimento: ");
		leia = new Scanner(System.in);
		diaN = leia.nextInt();
		
		System.out.println("Digite o seu mes de nascimento: ");
		leia = new Scanner(System.in);
		mesN = leia.nextInt();
		
		System.out.println("Digite o seu ano de nascimento: ");
		leia = new Scanner(System.in);
		anoN = leia.nextInt();
		
		
		anoH = data.get(Calendar.YEAR);
		mesH = data.get(Calendar.MONTH)+ 1;
		diaH = data.get(Calendar.DAY_OF_MONTH)+ 1;
		
		dias = ((anoH - anoN) * 365) + ((mesH - mesN) * 30) + ((diaH - diaN));
		
		System.out.println("a quantidades de dias que você viveu é: "+ dias);
	
	
		
		
	}
	
}