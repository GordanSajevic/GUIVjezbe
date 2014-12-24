import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GUIParniBrojevi {
	
	public static void main(String[] args) {
		JTextField text1 = new JTextField(5);
		JTextArea text2 = new JTextArea( 5, 10);
		text2.setLineWrap(true);
		JFrame window = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Parni brojevi");
		button.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(text1.getText());
				String str = evenNumbers(number);
				text2.setText(str);
			}
			
		});
		
		window.add(panel);
		panel.add(text1, BorderLayout.WEST);
		panel.add(button, BorderLayout.EAST);
		panel.add(text2, BorderLayout.SOUTH);
		window.setContentPane(panel);
		window.setSize(250, 200);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static String evenNumbers(int num)
	{
		String str = "";
		for (int i=num-1; i>0; i--)
		{
			if (i % 2 == 0)
			{
				str += i + "  ";
			}
		}
		return str;
	}

}
