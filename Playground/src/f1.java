import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class f1 extends JFrame {
	JButton b1, b2, b3, b4;
	JLabel lWel;

	f1() {
		super("Question one");
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		lWel = new JLabel(new ImageIcon("q1.png"));
		p1.add(lWel);

		b1 = new JButton("21");
		b2 = new JButton("55");
		b3 = new JButton("52");
		b4 = new JButton("50");
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
			if (e.getSource() == b4) {
				playground.count++;
				f2 q2 = new f2();
			} else {
				f2 q2 = new f2();
			}
		}
	}
}
