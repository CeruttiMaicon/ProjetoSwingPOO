package projetoswingpoo.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;

public class Cadastro extends JFrame {
	
	//Usar isso nas telas de cadastro nos JSLIDERS
	//aqui o valor ini = 0
	private int min = 0;
	private int max = 2;
	private int ini = 0;
	

	
	private JLabel label;
	private JTextField usuariotext;
	private JPasswordField senhatext;
	private JTextField nometext;
	private JTextField ceptext;
	private JTextField cpftext;
	private JTextField enderecotext;
	private JSpinner recdata;
	private JButton botaoproximo;
	
	public String getUsuario(){
		return usuariotext.getText();
	}
	public String getSenhatext(){
		return senhatext.getText();
	}
	public String getNome(){
		return nometext.getText();
	}
	public String getCEP(){
		return ceptext.getText();
	}
	public String getCPF(){
		return cpftext.getText();
	}
	public String getEndereco(){
		return enderecotext.getText();
	}
	public Date getData(){
		return (Date)recdata.getModel().getValue();
	}
	public JButton getBotao(){
		return botaoproximo;
	}
	
	
	

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
		// rolagem dentro do painel principal
		JPanel lista = new JPanel();
		lista.setLayout(null);

		// Acrescenta a barra de rolagem no painel 'lista'
		lista.setPreferredSize(new Dimension(250, 670));

		JScrollPane listScroller = new JScrollPane(lista);

		listScroller.setSize(300, 470);
		listScroller.setBounds(25, 75, 300, 470);
		listScroller.setVisible(true);
		// listScroller.setLocation(null);

		////////////////////////////////////////////////////

		// Palavras do Cabeçalho parte 1

		// A palavra que muda no IF do botão
		JLabel label1 = new JLabel("Por favor preencha as ", JLabel.CENTER);

		// ajustando transparencia da janela
		label1.setOpaque(true);

		label1.setFont(new Font("", Font.BOLD, 20));

		// Coordenadas para o Label
		label1.setBounds(40, 5, 280, 40);
		painel.add(label1);

		// Palavras do Cabeçalho parte 2

		// A palavra que muda no IF do botão
		JLabel label0 = new JLabel("informações necessárias ", JLabel.CENTER);

		// ajustando transparencia da janela
		label0.setOpaque(true);

		label0.setFont(new Font("", Font.BOLD, 20));

		// Coordenadas para o Label
		label0.setBounds(40, 35, 280, 40);
		painel.add(label0);

		//

		///////////////////////////////////////////////////

		// Letras Palavra Usuario
		JLabel label = new JLabel("Usuario:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label.setOpaque(true);

		label.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label.setBounds(10, 10, 280, 40);
		lista.add(label);

		////////////////////////////
		// Retangulo Usuario
		usuariotext = new JTextField();
		usuariotext.setBounds(10, 50, 270, 30);
		lista.add(usuariotext);

		//////////////////////////////////////

		//////////////////////////////////////

		// Letras Palavra Senha:

		JLabel label2 = new JLabel("Senha: ", JLabel.LEFT);

		// ajustando transparencia da janela
		label2.setOpaque(true);

		label2.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label2.setBounds(10, 90, 280, 40);
		lista.add(label2);

		///////////////////////////
		// Retangulo Senha
		senhatext = new JPasswordField();
		senhatext.setBounds(10, 130, 270, 30);
		lista.add(senhatext);

		/////////////////////////////////////////

		////////////////////////////////////////////

		// Letras Palavra "Nome"

		JLabel label4 = new JLabel("Nome completo:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label4.setOpaque(true);

		label4.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label4.setBounds(10, 250, 280, 40);
		lista.add(label4);

		//////////////////////////////////////

		///////////////////////////
		// Retangulo "Nome"
		nometext = new JTextField();
		nometext.setBounds(10, 290, 270, 30);
		lista.add(nometext);

		////////////////////////////////////////////
		// Letras Palavra "CEP"

		JLabel label5 = new JLabel("CEP:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label5.setOpaque(true);

		label5.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label5.setBounds(10, 330, 280, 40);
		lista.add(label5);

		//////////////////////////////////////

		///////////////////////////
		// Retangulo "CEP"
		ceptext = new JTextField();
		ceptext.setBounds(10, 370, 270, 30);
		lista.add(ceptext);

		////////////////////////////////////////////

		// Letras "CPF"

		JLabel label6 = new JLabel("CPF:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label6.setOpaque(true);

		label6.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label6.setBounds(10, 410, 280, 40);
		lista.add(label6);

		//////////////////////////////////////

		///////////////////////////
		// Retangulo CPF
		cpftext = new JTextField();
		cpftext.setBounds(10, 450, 270, 30);
		lista.add(cpftext);

		////////////////////////////////////////////

		// Letras Palavra "Endereço"

		JLabel label7 = new JLabel("Endereço:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label7.setOpaque(true);

		label7.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label7.setBounds(10, 490, 280, 40);
		lista.add(label7);

		//////////////////////////////////////

		///////////////////////////
		// Retangulo "Endereço"
		enderecotext = new JTextField();
		enderecotext.setBounds(10, 530, 270, 30);
		lista.add(enderecotext);

		////////////////////////////////////////////

		// Letras Palavra "Data de Nascimento"

		JLabel label8 = new JLabel("Data de Nascimento:  ", JLabel.LEFT);

		// ajustando transparencia da janela
		label8.setOpaque(true);

		label8.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label8.setBounds(10, 570, 280, 40);
		lista.add(label8);

		//////////////////////////////////////

		///////////////////////////
		// Retangulo "Data de Nascimento"
		SpinnerModel model = new SpinnerDateModel();

		recdata = new JSpinner(model);

		recdata.setBounds(10, 610, 70, 30);
		lista.add(recdata);

		////////////////////////////////////////////

		// Botão

		botaoproximo = new JButton("Próximo");
		botaoproximo.setBounds(40, 555, 265, 30);

		painel.add(botaoproximo);

		add(painel);
		painel.add(listScroller);

		/////////////////////////////////////////////

		// JSlider - para mostrar o progresso

		JSlider slider = new JSlider(JSlider.HORIZONTAL, min, max, ini);

		slider.setBounds(30, 578, 280, 40);
		
		painel.add(slider);

		////////////////////////////////////////////////

	}


}
