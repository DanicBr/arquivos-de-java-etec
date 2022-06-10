import java.util.*;
public class entradaComScanner {
	public static void main(String args[]) {
		float largura, comprimento, area, perimetro; 
		Scanner sc;//declarou
		try {
			System.out.println("Entre com o comprimento: ");
			sc = new Scanner(System.in);/*Criou*/
			comprimento = sc.nextFloat();
			
			System.out.println("Entre com a largura: ");
			sc= new Scanner(System.in);
			largura = sc.nextFloat();
			
			area = comprimento * largura;
			perimetro = comprimento *2 + largura * 2;
			System.out.println("area do retrangulo: "+ area);
			System.out.println("perimetro do retangulo :" + perimetro);
			
		}catch(NumberFormatException e) {
			System.out.println("Houve um erro na conversão, digite apenas caracteres numericos"
					+ "");
		}
	}
	
}

