package projetoswingpoo.view;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaInicioDoAPP extends JFrame {
	
	private JLabel label;
	
	public TelaInicioDoAPP() {

		// comando necessario para fechar o processo da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Exibe janela
		setVisible(true);

		// nome janela
		setTitle("Tela Inicio APP");

		// tamanho janela
		setSize(360, 678);

		// trava o tamanho da jenela
		setResizable(true);

		setup();

	}
	
	private void setup() {
		JPanel painel = new JPanel();
		painel.setLayout(null);
		painel.setSize(360, 378);
		
		// Letras Palavra 'Seja Bem Vindo'
		JLabel label = new JLabel("Seja Bem Vindo!", JLabel.CENTER);

		// ajustando transparencia da janela
		label.setOpaque(true);

		label.setFont(new Font("", Font.BOLD, 25));

		// Coordenadas para o Label
		label.setBounds(35, 219, 280, 40);
		painel.add(label);
		
		//////////////////////////////////////////////////
		
		// Letras Palavra 'Selecione a'
		JLabel label2 = new JLabel("Selecione a", JLabel.CENTER);

		// ajustando transparencia da janela
		label2.setOpaque(true);

		label2.setFont(new Font("", Font.BOLD, 25));

		// Coordenadas para o Label
		label2.setBounds(35, 269, 280, 40);
		painel.add(label2);
		
		///////////////////////////////////////////////////
		
		// Letras Palavra 'opção desejada'
		JLabel label3 = new JLabel("opção desejada", JLabel.CENTER);

		// ajustando transparencia da janela
		label3.setOpaque(true);

		label3.setFont(new Font("", Font.BOLD, 25));

		// Coordenadas para o Label
		label3.setBounds(35, 299, 280, 40);
		painel.add(label3);
		
		
		////////////////////////////////////////////////////
		
		//Botão Login
		JButton butao = new JButton("Login");
		butao.setBounds(35, 400, 280, 40);
		butao.setFont(new Font("", Font.BOLD, 15));
		
		painel.add(butao);
		
		//////////////////////////////////////////////////////
		
		//Botão Registro
		JButton butao2 = new JButton("Registrar");
		butao2.setBounds(35, 450, 280, 40);
		butao2.setFont(new Font("", Font.BOLD, 15));
		
		painel.add(butao2);
		
		
		add(painel);
		
	}
	
	

}
