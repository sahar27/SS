import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class playground extends JFrame {
	JButton btnQuizes, btnttt, btnpers;
	JLabel lWel, lwel1, lwel2, lwel3, lwel4;
	public static int count = 0;

	playground() {
		super("Playground");
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		lWel = new JLabel(new ImageIcon("welc.png"));
		p1.add(lWel);

		btnQuizes = new JButton("Quiz");
		btnttt = new JButton("TicTacToe");
		btnpers = new JButton("Personality test");
		p2.add(btnQuizes);
		p2.add(btnttt);
		p2.add(btnpers);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		setVisible(true);
		setLocationRelativeTo(null);

		MyListener L = new MyListener();
		btnQuizes.addActionListener(L);
		btnttt.addActionListener(L);
		btnpers.addActionListener(L);
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnQuizes)
				new Quiz();
			else if (e.getSource() == btnttt)
				new TicTacToe();
			else if (e.getSource() == btnpers)
				new pers();
		}
	}

	public static void main(String[] args) {
		new playground();
	}
}
