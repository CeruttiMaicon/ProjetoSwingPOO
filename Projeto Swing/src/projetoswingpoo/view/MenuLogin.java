package projetoswingpoo.view;
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

public class MenuLogin extends JFrame {

	private JLabel label;

	public MenuLogin() {

		// comando necessario para fechar o processo da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Exibe janela
		setVisible(true);

		// nome janela
		setTitle("Login");

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
		painel.setSize(300, 400);

		// Letras Palavra Login
		JLabel label = new JLabel("Usuário: ", JLabel.LEFT);

		// ajustando transparencia da janela
		label.setOpaque(true);

		label.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label.setBounds(40, 219, 280, 40);
		painel.add(label);
		
		//////////////////////////////////////
		JLabel label3 = new JLabel("Esqueceu a senha? ", JLabel.LEFT);

		// ajustando transparencia da janela
		label3.setOpaque(true);

		label3.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label3.setBounds(40, 370, 280, 40);
		painel.add(label3);

		//////////////////////////////////////

		// Letras Palavra Senha:

		JLabel label2 = new JLabel("Senha: ", JLabel.LEFT);

		// ajustando transparencia da janela
		label2.setOpaque(true);

		label2.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label2.setBounds(40, 300, 280, 40);
		painel.add(label2);

		////////////////////////////
		// Retangulo Login
		JTextField retangulo = new JTextField();
		retangulo.setBounds(40, 250, 270, 30);
		painel.add(retangulo);

		///////////////////////////
		// Retangulo Password
		JPasswordField pass = new JPasswordField();
		pass.setBounds(40, 330, 270, 30);
		painel.add(pass);
		
		

		////////////////////////////
		//A palavra que muda no IF do botão
		JLabel label5 = new JLabel("", JLabel.CENTER);

		// ajustando transparencia da janela
		label5.setOpaque(true);

		label5.setFont(new Font("", Font.BOLD, 12));

		// Coordenadas para o Label
		label5.setBounds(40, 400, 280, 40);
		painel.add(label5);

		// Botão
		JButton butao = new JButton("ENTRAR");
		butao.setBounds(40, 440, 265, 30);

		butao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// acoes do botão
				
				// validar o usuario com um
				// if?????????????????????????????????????
				if(retangulo.getText().equals("usuario") && pass.getText().equals("senha123")){
					label5.setForeground(Color.BLUE);
					System.out.println("Logou!");
					label5.setText("Logou");
				}else{
					System.out.println("Não Logou!");
					label5.setForeground(Color.RED);
					label5.setText("Login ou senha incorretos");
				}
			}
		});

		painel.add(butao);
		add(painel);

	}

}
