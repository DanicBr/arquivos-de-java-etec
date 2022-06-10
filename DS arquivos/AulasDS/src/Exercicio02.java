import java.util.Scanner;
public class Exercicio02 {
	@SuppressWarnings("resource")
	public static void main(String args []) {
		String msgPositiva = null;
		Scanner sc; 
		
			System.out.println("Digite uma mensagem positiva: ");
			sc = new Scanner(System.in);
			msgPositiva = sc.nextLine();
			System.out.println("");
			System.out.println("sua mensagem positiva foi: "+ msgPositiva);
		
	}
}
