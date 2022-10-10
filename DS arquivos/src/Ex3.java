import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldo = 0;

		for (int i = 0; i < 3; i++) { 
			System.out.println(String.format("[%s] Digite o nome da conta: ", i+1));
			sc.next();

			System.out.println(String.format("[%s] Digite o saldo da conta: ", i+1));
			saldo += Double.parseDouble(sc.next());
		}

		System.out.println(String.format("A Media dos saldos é de: R$%s", saldo/3));
 }
}

