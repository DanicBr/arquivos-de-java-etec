import java.util.Scanner;

public class Ex2 {
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("qual a distancia percorrida pelo veiculo?");
		int distancia = sc.nextInt();
		
		System.out.println("qual o consumo do veiculo em KM por litros?");
		int consumo = sc.nextInt();
		
		System.out.println("A quantida de litros necessarios para percorrer os " + distancia + "km, com o consumo de "+consumo+ "KM por litros, é de "+ distancia / consumo );
	 	
		
	
	
	}
}
