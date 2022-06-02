package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelGroupLayoutTest extends JPanel {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JTextField tf = new JTextField();
		tf.setPreferredSize(new Dimension(120, 30));
		f.add(BorderLayout.NORTH, tf);
		f.add(BorderLayout.CENTER, new JPanel().add(new PanelGroupLayoutTest()));
		f.setVisible(true);
		f.setSize(new Dimension(300, 300));
		f.pack();

	}

	public PanelGroupLayoutTest() {
		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);

		JButton delete = new JButton("C");
		delete.setPreferredSize(new Dimension(50, 40));
		JButton seven = new JButton("7");
		seven.setPreferredSize(new Dimension(30, 30));
		JButton four = new JButton("4");
		JButton one = new JButton("1");
		JButton zero = new JButton("0");
		JButton eight = new JButton("8");
		JButton five = new JButton("5");
		JButton two = new JButton("2");
		JButton dot = new JButton(".");
		dot.setPreferredSize(new Dimension(30, 30));
		JButton nine = new JButton("9");
		JButton six = new JButton("6");
		JButton three = new JButton("3");
		JButton multiply = new JButton("*");
		JButton divide = new JButton("/");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton equals = new JButton("=");

		layout.setHorizontalGroup(layout.createSequentialGroup()

				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(delete)
						.addComponent(seven).addComponent(four).addComponent(one).addComponent(zero))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(eight)
						.addComponent(five).addComponent(two).addComponent(dot))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(nine).addComponent(six)
						.addComponent(three).addComponent(minus))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(multiply)
						.addComponent(divide).addComponent(plus).addComponent(equals)));
		layout.setVerticalGroup(layout.createSequentialGroup().addComponent(delete)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(seven)
						.addComponent(eight).addComponent(nine).addComponent(multiply))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(four).addComponent(five)
						.addComponent(six).addComponent(divide))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(one).addComponent(two)
						.addComponent(three).addComponent(plus))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(zero).addComponent(dot)
						.addComponent(minus).addComponent(equals)));
		layout.linkSize(delete, one, two, three, four, five, six, seven, eight, nine, zero, multiply, divide, plus,
				minus, equals, dot);
	}
}
