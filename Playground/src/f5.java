import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class f5 extends JFrame {
	JButton b1, b2;
	JLabel lWel, lwel1, lwel2, lwel4, btn, celeb;

	f5() {
		super("RESULT!!");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());

		JPanel p0 = new JPanel();
		JPanel p1 = new JPanel(new GridLayout(3, 1));
		JPanel p2 = new JPanel();

		lwel1 = new JLabel("                                    You got " + playground.count + " out of 4!");
		lwel2 = new JLabel("                   If you want to play again, then click here:");
		lwel4 = new JLabel("");

		switch (playground.count) {
		case 0: {
			btn = new JLabel(new ImageIcon("q4.png"));
			p0.add(lWel = new JLabel(new ImageIcon("celeb.png")));
			break;
		}
		case 1: {
			btn = new JLabel(new ImageIcon("q4.png"));
			p0.add(lWel = new JLabel(new ImageIcon("celeb0.png")));
			break;
		}
		case 2: {
			btn = new JLabel(new ImageIcon("q4.png"));
			p0.add(lWel = new JLabel(new ImageIcon("celeb1.png")));
			break;
		}
		case 3: {
			btn = new JLabel(new ImageIcon("q4.png"));
			p0.add(lWel = new JLabel(new ImageIcon("celeb2.png")));
			break;
		}
		case 4: {
			btn = new JLabel(new ImageIcon("q4.png"));
			p0.add(lWel = new JLabel(new ImageIcon("celeb3.png")));
			break;
		}
		}

		p1.add(lwel1);
		p1.add(lwel2);
		p1.add(lwel4);

		b1 = new JButton("Play");
		b2 = new JButton("Home");
		p2.add(b1);
		p2.add(b2);

		getContentPane().add(p0, BorderLayout.NORTH);
		getContentPane().add(p1, BorderLayout.CENTER);
		getContentPane().add(p2, BorderLayout.SOUTH);

		setVisible(true);
		setLocationRelativeTo(null);
		MyListener L = new MyListener();
		b1.addActionListener(L);
		b2.addActionListener(L);
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				playground.count = 0;
				new Quiz();
			} else if (e.getSource() == b2) {
				playground.count = 0;
				new playground();
			}
		}
	}
}
