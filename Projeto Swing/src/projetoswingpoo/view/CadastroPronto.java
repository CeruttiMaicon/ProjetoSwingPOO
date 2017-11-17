package projetoswingpoo.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CadastroPronto extends JFrame {
	
	private int min = 0, max = 2, ini = 2;

	
	public CadastroPronto(){

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// Exibe janela
			setVisible(true);

			// nome janela
			setTitle("Cadastro Foto");

			// tamanho janela
			setSize(360, 678);

			// trava o tamanho da jenela
			setResizable(true);

			setup();
	}
	
	private void setup(){
		JPanel painel = new JPanel();
		painel.setLayout(null);
		painel.setSize(300, 470);

		
		
	}

}
