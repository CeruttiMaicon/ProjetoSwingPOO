package projetoswingpoo.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jdesktop.swingx.JXDatePicker;
public class Calendario extends JPanel{
	 static JLabel label = new JLabel();
	 static JXDatePicker datePicker = new JXDatePicker();
	 JFrame frame;
	public Calendario(){
	}
		private static void createAndShowGUI() {
			label.setText("Calendário.");
			JFrame frame = new JFrame("JXDatePicker");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Calendario newContentPane = new Calendario();
			newContentPane.setOpaque(true); 
			frame.setContentPane(newContentPane);
			frame.add(label);
			frame.add(datePicker);
			frame.pack();
			frame.setVisible(true);
			frame.setSize(380,678);
			frame.setBounds(25, 75, 300, 470);
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
	}