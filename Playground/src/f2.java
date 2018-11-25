import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class f2 extends JFrame {
	JButton b1, b2, b3, b4;
	JLabel lWel, lwel1;

	f2() {
		super("Question two");
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		lwel1 = new JLabel(new ImageIcon("q2.png"));
		p1.add(lwel1);

		b1 = new JButton("6");
		b2 = new JButton("8");
		b3 = new JButton("6");
		b4 = new JButton("9");
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
			if (e.getSource() == b2) {
				playground.count++;
				f3 q2 = new f3();
			} else {
				f3 q2 = new f3();
			}
		}
	}
}
