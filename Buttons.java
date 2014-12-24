package lab31;

//Samostalni rad

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Buttons {
	public static void main(String[] args) {
		JFrame gui101 = new JFrame();
		gui101.setVisible(true);
		gui101.setSize(300, 300);
		gui101.setTitle("GUI101");
		gui101.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = new Dimension();
		Dimension d = new Dimension();
		d.setSize(450, 450);
		dim.setSize(500, 500);
		gui101.setMaximumSize(dim);
		JPanel panel = new JPanel();
		panel.setSize(d);
		JButton button1 = new JButton("Prvo dugme");
		panel.add(button1);
		JButton button2 = new JButton("Drugo dugme");
		panel.add(button2);
		gui101.add(panel);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				button1.setText("Kliknuto!");
				button2.setText("Drugo dugme");
				
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				button2.setText("Kliknuto!");
				button1.setText("Prvo dugme");
				
			}
		});
	}

}
