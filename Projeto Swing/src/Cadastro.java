import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class Cadastro extends JFrame {

	private JLabel label;

	public Cadastro() {

		// comando necessario para fechar o processo da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Exibe janela
		setVisible(true);

		// nome janela
		setTitle("Cadastro");

		// tamanho janela
		setSize(360, 678);

		// trava o tamanho da jenela
		setResizable(true);

		setup();

	}

	// Configura a janela
	// ADD os Labels, Botoes, o que precisar

	private void setup() {
		JPanel painel = new JPanel();
		painel.setLayout(null);
		painel.setSize(300, 470);

		// Criando um segundo painel para servir de 
		//rolagem dentro do painel principal
		JPanel lista = new JPanel();
		lista.setLayout(null);
		
		//Acrescenta a barra de rolagem no painel 'lista'
		lista.setPreferredSize(new Dimension(250,800));
		

		
		JScrollPane listScroller = new JScrollPane(lista);
		
		

		listScroller.setSize(300, 470);
		listScroller.setBounds(25, 95, 300, 470);
		listScroller.setVisible(true);
		//listScroller.setLocation(null);
		

		////////////////////////////////////////////////////

		// Palavras do Cabeçalho parte 1

		// A palavra que muda no IF do botão
		JLabel label1 = new JLabel("Por favor preencha as ", JLabel.CENTER);

		// ajustando transparencia da janela
		label1.setOpaque(true);

		label1.setFont(new Font("", Font.BOLD, 20));

		// Coordenadas para o Label
		label1.setBounds(40, 20, 280, 40);
		painel.add(label1);

		// Palavras do Cabeçalho parte 2

		// A palavra que muda no IF do botão
		JLabel label0 = new JLabel("informações necessárias ", JLabel.CENTER);

		// ajustando transparencia da janela
		label0.setOpaque(true);

		label0.setFont(new Font("", Font.BOLD, 20));

		// Coordenadas para o Label
		label0.setBounds(40, 50, 280, 40);
		painel.add(label0);

		//

		///////////////////////////////////////////////////

		// Letras Palavra Nome
		JLabel label = new JLabel("Nome:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label.setOpaque(true);

		label.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label.setBounds(10, 10, 280, 40);
		lista.add(label);

		////////////////////////////
		// Retangulo Nome
		JTextField retangulo1 = new JTextField();
		retangulo1.setBounds(10, 50, 270, 30);
		lista.add(retangulo1);

		//////////////////////////////////////

		//////////////////////////////////////

		// Letras Palavra CPF:

		JLabel label2 = new JLabel("CPF: ", JLabel.LEFT);

		// ajustando transparencia da janela
		label2.setOpaque(true);

		label2.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label2.setBounds(10, 90, 280, 40);
		lista.add(label2);

		///////////////////////////
		// Retangulo CPF
		JTextField retangulo2 = new JTextField();
		retangulo2.setBounds(10, 130, 270, 30);
		lista.add(retangulo2);

		/////////////////////////////////////////

		// Letras Palavra RG

		JLabel label3 = new JLabel("RG:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label3.setOpaque(true);

		label3.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label3.setBounds(10, 170, 280, 40);
		lista.add(label3);

		//////////////////////////////////////

		///////////////////////////
		// Retangulo RG
		JTextField retangulo3 = new JTextField();
		retangulo3.setBounds(10, 210, 270, 30);
		lista.add(retangulo3);

		////////////////////////////////////////////

		// Letras Palavra Endereço

		JLabel label4 = new JLabel("Endereço:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label4.setOpaque(true);

		label4.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label4.setBounds(10, 250, 280, 40);
		lista.add(label4);

		//////////////////////////////////////

		///////////////////////////
		// Retangulo Endereço
		JTextField retangulo4 = new JTextField();
		retangulo4.setBounds(10, 290, 270, 30);
		lista.add(retangulo4);

		////////////////////////////////////////////
		// Letras Palavra Ano Nascimento

		JLabel label5 = new JLabel("Ano Nascimento:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label5.setOpaque(true);

		label5.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label5.setBounds(10, 330, 280, 40);
		lista.add(label5);

		//////////////////////////////////////

		///////////////////////////
		// Retangulo Ano Nascimento
		JTextField retangulo5 = new JTextField();
		retangulo5.setBounds(10, 370, 270, 30);
		lista.add(retangulo5);

		////////////////////////////////////////////

		// Letras Palavra E-mail

		JLabel label6 = new JLabel("E-mail:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label6.setOpaque(true);

		label6.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label6.setBounds(10, 410, 280, 40);
		lista.add(label6);

		//////////////////////////////////////

		///////////////////////////
		// Retangulo E-mail
		JTextField retangulo6 = new JTextField();
		retangulo6.setBounds(10, 450, 270, 30);
		lista.add(retangulo6);

		////////////////////////////////////////////

		// Letras Palavra "SEM PALAVRA"

		JLabel label7 = new JLabel("'EDITAR'  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label7.setOpaque(true);

		label7.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label7.setBounds(10, 490, 280, 40);
		lista.add(label7);

		//////////////////////////////////////

		///////////////////////////
		// Retangulo "SEM PALAVRA"
		JTextField retangulo7 = new JTextField();
		retangulo7.setBounds(10, 530, 270, 30);
		lista.add(retangulo7);

		////////////////////////////////////////////

		// Botão
		JButton butao = new JButton("Proximo");
		butao.setBounds(40, 570, 265, 30);

		painel.add(butao);

		add(painel);
		painel.add(listScroller);
		

	}

}
