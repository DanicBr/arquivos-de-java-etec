import java.util.Scanner;
public class Exercicio04 {
	public static void main(String args[]) {
		float area, altura, largura;
		Scanner leia;
		
		System.out.println("Digite a Altura da area: ");
		leia = new Scanner(System.in);
		altura = leia.nextFloat();
		
		System.out.println("Digite a largura da area: ");
		leia = new Scanner(System.in);
		largura = leia.nextFloat();
		
		area = largura * altura;
		
		System.out.println("O tamanho da area em metros quadrados é: "+ area);
	
	}
	
}
