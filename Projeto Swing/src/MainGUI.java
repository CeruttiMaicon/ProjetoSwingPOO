import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainGUI extends JFrame {
	
	private JLabel label;
	
	public MainGUI(){

		//comando necessario para fechar o processo da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Exibe janela
		setVisible(true);
		
		//nome janela
		setTitle("Minha Janela");
		
		//tamanho janela
		setSize(300, 400);
		
		//trava o tamanho da jenela
		setResizable(true);
		
		setup();
		
	}
	
	//Configura a janela
	// ADD os Labels, Botoes, o que precisar
	
	private void setup(){
		JPanel painel = new JPanel();
		painel.setLayout(null);
		painel.setSize(300, 400);
		
		JLabel label = new JLabel("I LOVE P²K",JLabel.CENTER);
		
		//ajustando transparencia da janela 
		label.setOpaque(true);
		
		//cor funfo
		label.setBackground(Color.BLACK);
		
		//cor letra
		label.setForeground(Color.WHITE);
		
		label.setFont(new Font("", Font.BOLD, 48 ));
		
		//Coordenadas para o Label
		label.setBounds(10, 10, 280, 40);
		painel.add(label);
		
		
		
		JButton butao = new JButton("Click me!");
		butao.setBounds(10, 60, 280, 30);
		
		butao.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0){
				System.out.println("Clicou!");
				label.setText("Cliquei no Botão");
				if (label.getBackground().equals(Color.BLACK)){
					label.setBackground(Color.WHITE);
					label.setForeground(Color.BLACK);
				
				}else{
					label.setBackground(Color.BLACK);
					label.setForeground(Color.WHITE);
					
				}
			}
		});
			
		
		
		painel.add(butao);
		add(painel);
		
		
		
	}

}
