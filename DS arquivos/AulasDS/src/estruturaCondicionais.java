//Exemplo01 - Estrutura-Condicional - If and Else

import javax.swing.JOptionPane;
public class estruturaCondicionais {
	public static void main(String [] args) {
		Object[] op = {"Masculino", "Feminino"};
		String resp = (String)JOptionPane.showInputDialog(null,"selecione o sexo:\n ", "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, op ,"Masculino");
		if(resp == null ) {
			JOptionPane.showMessageDialog(null, "Voc� pressionou Cancel");
			
		}
		if(resp.equals ("Masculino" )) {
			JOptionPane.showMessageDialog(null, "Voc� � homem");
		}
		
		if(resp.equals ("Feminino" )) {
			JOptionPane.showMessageDialog(null, "Voc� � mulher");
		}
	
		System.exit(0);
	}
	
}
