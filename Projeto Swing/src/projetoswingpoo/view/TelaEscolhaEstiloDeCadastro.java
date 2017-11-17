package projetoswingpoo.view;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaEscolhaEstiloDeCadastro extends JFrame {

	private JLabel label;

	public TelaEscolhaEstiloDeCadastro() {
		// comando necessario para fechar o processo da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Exibe janela
		setVisible(true);

		// nome janela
		setTitle("Tela Escolha Tipo de Cadastro");

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

		////////////////////////////////////////////////

		// Letras Palavra 'Selecione a'
		JLabel label2 = new JLabel("Você deseja se registrar", JLabel.CENTER);

		// ajustando transparencia da janela
		label2.setOpaque(true);

		label2.setFont(new Font("", Font.BOLD, 22));

		// Coordenadas para o Label
		label2.setBounds(35, 10, 280, 40);
		painel.add(label2);

		///////////////////////////////////////////////
		JLabel label3 = new JLabel("como prestador de serviço", JLabel.CENTER);

		// ajustando transparencia da janela
		label3.setOpaque(true);

		label3.setFont(new Font("", Font.BOLD, 22));

		// Coordenadas para o Label
		label3.setBounds(35, 40, 280, 40);
		painel.add(label3);

		///////////////////////////////////////////////
		JLabel label4 = new JLabel("ou como um contratante?", JLabel.CENTER);

		// ajustando transparencia da janela
		label4.setOpaque(true);

		label4.setFont(new Font("", Font.BOLD, 22));

		// Coordenadas para o Label
		label4.setBounds(35, 70, 280, 40);
		painel.add(label4);

		///////////////////////////////////////////////
		JLabel label5 = new JLabel("Atenção!", JLabel.CENTER);

		// ajustando transparencia da janela
		label5.setOpaque(true);

		label5.setFont(new Font("", Font.BOLD, 18));
		label5.setForeground(Color.RED);

		// Coordenadas para o Label
		label5.setBounds(35, 120, 280, 40);
		painel.add(label5);

		///////////////////////////////////////////////
		JLabel label6 = new JLabel("Para ser um prestador de serviço", JLabel.CENTER);

		// ajustando transparencia da janela
		label6.setOpaque(true);

		label6.setFont(new Font("", Font.BOLD, 16));

		// Coordenadas para o Label
		label6.setBounds(35, 150, 280, 40);
		painel.add(label6);

		///////////////////////////////////////////////
		JLabel label7 = new JLabel("no APP é", JLabel.CENTER);

		// ajustando transparencia da janela
		label7.setOpaque(true);

		label7.setFont(new Font("", Font.BOLD, 16));

		// Coordenadas para o Label
		label7.setBounds(35, 175, 280, 40);
		painel.add(label7);

		///////////////////////////////////////////////
		JLabel label8 = new JLabel("necessário ter 50 anos ou mais.", JLabel.CENTER);

		// ajustando transparencia da janela
		label8.setOpaque(true);

		label8.setFont(new Font("", Font.BOLD, 16));

		// Coordenadas para o Label
		label8.setBounds(35, 200, 280, 40);
		painel.add(label8);

		///////////////////////////////////////////////
		JButton buton = new JButton("Quero ser um prestador de serviço!");
		buton.setBounds(40, 320, 265, 30);
		painel.add(buton);

		///////////////////////////////////////////////
		JButton buton2 = new JButton("Contratante");
		buton2.setBounds(40, 370, 265, 30);
		painel.add(buton2);

		///////////////////////////////////////////////
		JLabel label9 = new JLabel("Caso queira mudar de Contratante para", JLabel.CENTER);

		// ajustando transparencia da janela
		label9.setOpaque(true);

		label9.setFont(new Font("", Font.BOLD, 12));
		label9.setForeground(Color.GRAY);

		// Coordenadas para o Label
		label9.setBounds(35, 510, 280, 40);
		painel.add(label9);

		///////////////////////////////////////////////
		JLabel label10 = new JLabel("prestador de serviço ou de prestador de", JLabel.CENTER);

		// ajustando transparencia da janela
		label10.setOpaque(true);

		label10.setFont(new Font("", Font.BOLD, 12));
		label10.setForeground(Color.GRAY);

		// Coordenadas para o Label
		label10.setBounds(35, 535, 280, 40);
		painel.add(label10);

		///////////////////////////////////////////////
		JLabel label11 = new JLabel("serviço para Contratante é possível fazer", JLabel.CENTER);

		// ajustando transparencia da janela
		label11.setOpaque(true);

		label11.setFont(new Font("", Font.BOLD, 12));
		label11.setForeground(Color.GRAY);

		// Coordenadas para o Label
		label11.setBounds(35, 560, 280, 40);
		painel.add(label11);

		///////////////////////////////////////////////
		JLabel label12 = new JLabel("isso facilmente na sua ágina inicial", JLabel.CENTER);

		// ajustando transparencia da janela
		label12.setOpaque(true);

		label12.setFont(new Font("", Font.BOLD, 12));
		label12.setForeground(Color.GRAY);

		// Coordenadas para o Label
		label12.setBounds(35, 585, 280, 40);
		painel.add(label12);

		add(painel);

	}

}
