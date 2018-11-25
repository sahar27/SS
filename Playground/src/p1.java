import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class p1 extends JFrame {
	JButton b1, b2, b3, b4;
	JLabel lWel;

	p1() {
		super("Your result");
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		lWel = new JLabel(new ImageIcon("p1.png"));
		p1.add(lWel);

		b1 = new JButton("Back");
		p2.add(b1);

		getContentPane().add(p1);
		getContentPane().add(p2);

		setVisible(true);
		setLocationRelativeTo(null);
		MyListener L = new MyListener();
		b1.addActionListener(L);
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				new pers();

			}
		}
	}
}
