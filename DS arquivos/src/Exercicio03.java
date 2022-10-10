import java.util.*;
public class Exercicio03 {
	@SuppressWarnings("resource")
	public static void main(String []args) {
		String nome, hobbie;
		int idade;
		Scanner leia;
		
		System.out.println("digite o seu nome: ");
		leia = new Scanner(System.in);
		nome = leia.nextLine();
		
		System.out.println("");
		
		System.out.println("digite a sua idade: ");
		leia = new Scanner(System.in);
		idade = leia.nextInt();
		
		System.out.println("");
		
		System.out.println("Digite sua musica/filme/sport/lazer preferido: ");
		leia = new Scanner(System.in);
		hobbie = leia.nextLine();
		
		System.out.println("");
		
		System.out.println("Seu nome é: " + nome  );
		System.out.println("Sua idade é: " + idade );
		System.out.println("Seu hobbie favorito é: " + hobbie  );

		
	}
	
}

/**/
