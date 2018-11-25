import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pers extends JFrame {
	JButton b1, b2, b3, b4, b5;
	JLabel lWel;

	pers() {
		super("Personality quiz");
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		lWel = new JLabel(new ImageIcon("perso.png"));
		p1.add(lWel);

		b1 = new JButton(new ImageIcon("z1.png"));
		b2 = new JButton(new ImageIcon("z2.png"));
		b3 = new JButton(new ImageIcon("z3.png"));
		b4 = new JButton(new ImageIcon("z4.png"));
		b5 = new JButton("Home");
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p3.add(b5);

		getContentPane().add(p1);
		getContentPane().add(p2);
		getContentPane().add(p3);

		setVisible(true);
		setLocationRelativeTo(null);
		MyListener L = new MyListener();
		b1.addActionListener(L);
		b2.addActionListener(L);
		b3.addActionListener(L);
		b4.addActionListener(L);
		b5.addActionListener(L);
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				new p1();
			} else if (e.getSource() == b2) {
				new p2();
			} else if (e.getSource() == b3) {
				new p3();
			} else if (e.getSource() == b4) {
				new p4();
			} else if (e.getSource() == b5) {
				new playground();
			}
		}
	}
}
