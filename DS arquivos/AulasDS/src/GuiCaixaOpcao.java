import java.awt.event.*;
import javax.swing.*;
public class GuiCaixaOpcao extends JPanel{
    private JButton btVerificar, btMarcar, btDesmarcar;
    private JCheckBox ckIngles, ckInformatica;
    
    public GuiCaixaOpcao () {
        inicializarComponentes();
        definirEventos();
        add(btVerificar);
        add(ckIngles);
        add(ckInformatica);
        add(btMarcar);
        add(btDesmarcar);
        btVerificar.setBounds(20, 70, 100, 20);
        ckIngles.setBounds(15, 15, 100, 25);
        ckInformatica.setBounds(15, 40, 100, 25);
        btMarcar.setBounds(20, 100, 100, 20);
    }
        
        private void definirEventos(){
            btMarcar.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent arg0){
                    ckInformatica.setSelected(true);
                    ckIngles.setSelected(true);
                 }
            });
            btDesmarcar.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0) {
                    ckInformatica.setSelected(false);
                    ckIngles.setSelected(true);
                }
            });
            btVerificar.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    String selecao = "Selecionados: ";
                    if(ckIngles.isSelected()){
                        selecao += "\nIngles";
                    }
                }
            });
            }
        
        private void inicializarComponentes() {
        	/*so fiz isso pra n ficar com erro*/
        }
                     
        
    }
