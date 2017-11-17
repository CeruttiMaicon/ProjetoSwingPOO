package projetoswingpoo.view;


import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class CadastroFoto extends JFrame {

	private int min = 0, max = 2, ini = 1;

	public CadastroFoto() {

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

	private void setup() {
		JPanel painel = new JPanel();
		painel.setLayout(null);
		// painel.setSize(300, 470);

		//////////////////////////////////////////////////////////

		// Cabeçalho texto 1

		JLabel label = new JLabel("Por favor clique no ícone ", JLabel.CENTER);

		// ajustando transparencia da janela
		label.setOpaque(true);

		label.setFont(new Font("", Font.BOLD, 20));

		// Coordenadas para o Label
		label.setBounds(40, 5, 280, 40);
		painel.add(label);

		////////////////////////////////////////////////////////

		// Cabeçalho texto 2

		JLabel label1 = new JLabel("para adicionar uma foto ", JLabel.CENTER);

		// ajustando transparencia da janela
		label1.setOpaque(true);

		label1.setFont(new Font("", Font.BOLD, 20));

		// Coordenadas para o Label
		label1.setBounds(40, 35, 280, 40);
		painel.add(label1);

		///////////////////////////////////////////////////////////

		// Adicionando imagem na Painel por uma label

		ImageIcon imagem = new ImageIcon(getClass().getResource("usuario-imagem.png"));
		JLabel label2 = new JLabel(imagem);
		label2.setBounds(33, 120, 280, 287);
		painel.add(label2);

		///////////////////////////////////////////////////////////

		////////////////////////////////////////////

		// Botão

		JButton butao = new JButton("Próximo");
		butao.setBounds(40, 500, 265, 30);

		painel.add(butao);

		/////////////////////////////////////////////

		// Botão

		JButton butao2 = new JButton("Pular Etapa");
		butao2.setBounds(40, 540, 265, 30);

		painel.add(butao2);

		/////////////////////////////////////////////

		// JSlider - para mostrar o progresso

		JSlider slider = new JSlider(JSlider.HORIZONTAL, min, max, ini);

		slider.setBounds(30, 578, 280, 40);

		painel.add(slider);

		////////////////////////////////////////////////

		add(painel);
	}

}