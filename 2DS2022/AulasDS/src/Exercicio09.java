import java.util.Scanner;
public class Exercicio09 {
	public static void main(String args[]) {
		int primeiro, lanterna, pn; 
		
		Scanner leia;
		
		System.out.println("digite a pontuação do time lider: ");
		leia = new Scanner(System.in);
		primeiro = leia.nextInt();	
		
		System.out.println("digite a pontuação do time lanterna: ");
		leia = new Scanner(System.in);
		lanterna = leia.nextInt();
		
		pn = ((primeiro - lanterna) / 3) + 1;
		
		
		System.out.println("A quantidade de vitoria necessarias para o lanterna ultrapassar o primeiro colocado é de: " + pn);
		
		
		

	}
}
