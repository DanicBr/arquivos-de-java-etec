import javax.swing.JOptionPane;
public class Exercicio08 {
	public static void main(String args[]) {
		String nota;
		
		float nota1, nota2, nota3, media;
		
		try {
			nota = JOptionPane.showInputDialog("digite a nota da primeira prova: ");
			nota1 = Float.parseFloat(nota);
			
			nota = JOptionPane.showInputDialog("digite a nota da segunda prova: ");
			nota2 = Float.parseFloat(nota);
			
			nota = JOptionPane.showInputDialog("digite a nota do trabalho: ");
			nota3 = Float.parseFloat(nota);
		 	
			media = (nota1 +nota2+ nota3)/3; 
			
			
			if (media <= 6) {
				JOptionPane.showMessageDialog(null,"Aluno reprovado com media de: " + media);
				
			}else {
				JOptionPane.showMessageDialog(null,"Aluno aprovado com media de: " + media);
			}
			
		}catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,"Houve erro na convers�o, digite apenas caracteres numericos"+ erro.toString());
			
		}
		System.exit(0);
		
		
		
	}
}
