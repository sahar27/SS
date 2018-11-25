import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JFrame {
	JButton b1, b2, b3, b4;
	JLabel lWel;

	Quiz() {
		super("Quiz");
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		lWel = new JLabel(new ImageIcon("quiz.png"));
		p1.add(lWel);

		b1 = new JButton("I'm ready");
		b1.setSize(40, 100);
		p2.add(b1);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		setVisible(true);
		setLocationRelativeTo(null);
		MyListener L = new MyListener();
		b1.addActionListener(L);
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				f1 q1 = new f1();
			}
		}
	}
}
