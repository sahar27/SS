import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class f4 extends JFrame {
	JButton b1, b2, b3, b4;
	JLabel lWel;

	f4() {
		super("Question four");
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		lWel = new JLabel(new ImageIcon("q4.png"));
		p1.add(lWel);

		b1 = new JButton("5");
		b2 = new JButton("11");
		b3 = new JButton("7");
		b4 = new JButton("10");
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);

		getContentPane().add(p1);
		getContentPane().add(p2);

		setVisible(true);
		setLocationRelativeTo(null);
		MyListener L = new MyListener();
		b1.addActionListener(L);
		b2.addActionListener(L);
		b3.addActionListener(L);
		b4.addActionListener(L);
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				playground.count++;
				f5 q2 = new f5();
			} else {
				f5 q2 = new f5();
			}
		}
	}
}
