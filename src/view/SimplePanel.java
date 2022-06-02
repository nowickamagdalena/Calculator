package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.SimpleCalculate;

public class SimplePanel extends JPanel {

	private JButton delete, seven, four, one, zero, eight, five, two, dot, nine, six, three, multiply, divide, plus,
			minus, equals;
	private static JTextField display;

	public SimplePanel() {
		super();

		JPanel paneltop = new JPanel();
		JPanel panelkeys = new JPanel();
		JPanel panelkeys1 = new JPanel();
		JPanel panelcentre = new JPanel();

		panelcentre.setLayout(new BoxLayout(panelcentre, BoxLayout.Y_AXIS));

		panelkeys.setLayout(new GridLayout(4, 4));
		panelkeys1.setLayout(new GridLayout(1, 1));

		panelkeys.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelkeys1.setAlignmentX(Component.RIGHT_ALIGNMENT);

		panelcentre.add(panelkeys1);
		panelcentre.add(panelkeys);

		this.add(BorderLayout.NORTH, paneltop);
		this.add(BorderLayout.SOUTH, panelcentre);

		display = new JTextField();
		display.setPreferredSize(new Dimension(200, 30));
		paneltop.add(display);

		delete = new JButton("C");
		delete.setPreferredSize(new Dimension(30, 30));
		delete.addActionListener(new SimpleCalculate.ButtonDeleteReaction());
		seven = new JButton("7");
		seven.addActionListener(new SimpleCalculate.ButtonSevenReaction());
		four = new JButton("4");
		four.addActionListener(new SimpleCalculate.ButtonFourReaction());
		one = new JButton("1");
		one.addActionListener(new SimpleCalculate.ButtonOneReaction());
		zero = new JButton("0");
		zero.addActionListener(new SimpleCalculate.ButtonZeroReaction());
		eight = new JButton("8");
		eight.addActionListener(new SimpleCalculate.ButtonEightReaction());
		five = new JButton("5");
		five.addActionListener(new SimpleCalculate.ButtonFiveReaction());
		two = new JButton("2");
		two.addActionListener(new SimpleCalculate.ButtonTwoReaction());
		dot = new JButton(".");
		dot.addActionListener(new SimpleCalculate.ButtonDotReaction());
		nine = new JButton("9");
		nine.addActionListener(new SimpleCalculate.ButtonNineReaction());
		six = new JButton("6");
		six.addActionListener(new SimpleCalculate.ButtonSixReaction());
		three = new JButton("3");
		three.addActionListener(new SimpleCalculate.ButtonThreeReaction());
		multiply = new JButton("*");
		multiply.addActionListener(new SimpleCalculate.ButtonTimesReaction());
		divide = new JButton("/");
		divide.addActionListener(new SimpleCalculate.ButtonDivideReaction());
		plus = new JButton("+");
		plus.addActionListener(new SimpleCalculate.ButtonPlusReaction());
		minus = new JButton("-");
		minus.addActionListener(new SimpleCalculate.ButtonMinusReaction());
		equals = new JButton("=");
		equals.addActionListener(new SimpleCalculate.ButtonEqualsReaction());

		panelkeys1.add(delete);

		panelkeys.add(seven);
		panelkeys.add(eight);
		panelkeys.add(nine);
		panelkeys.add(multiply);
		panelkeys.add(four);
		panelkeys.add(five);
		panelkeys.add(six);
		panelkeys.add(divide);
		panelkeys.add(one);
		panelkeys.add(two);
		panelkeys.add(three);
		panelkeys.add(plus);
		panelkeys.add(zero);
		panelkeys.add(dot);
		panelkeys.add(minus);
		panelkeys.add(equals);

	}

	public JTextField getDisplay() {
		return display;
	}

}
