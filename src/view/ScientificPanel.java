package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.ScientificCalculate;

public class ScientificPanel extends JPanel {
	private JButton delete, seven, four, one, zero, eight, five, two, dot, nine, six, three, multiply, divide, plus,
			minus, equals, pi, sqrt, ln, sin, cos, lbracket, rbracket;
	private static JTextField display;
	private ArrayList<String> text = new ArrayList<>();

	public ScientificPanel() {
		super();
		BoxLayout boxlay = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(boxlay);

		JPanel paneltop = new JPanel();
		JPanel panelkeys = new JPanel();
		panelkeys.setLayout(new GridLayout(4, 6));

		this.add(paneltop);
		this.add(panelkeys);
		display = new JTextField();
		display.setPreferredSize(new Dimension(200, 30));
		paneltop.add(display);

		delete = new JButton("C");
		delete.setPreferredSize(new Dimension(40, 30));
		delete.addActionListener(new ScientificCalculate.ButtonDeleteReaction());
		seven = new JButton("7");
		seven.addActionListener(new ScientificCalculate.ButtonSevenReaction());
		four = new JButton("4");
		four.addActionListener(new ScientificCalculate.ButtonFourReaction());
		one = new JButton("1");
		one.addActionListener(new ScientificCalculate.ButtonOneReaction());
		zero = new JButton("0");
		zero.addActionListener(new ScientificCalculate.ButtonZeroReaction());
		eight = new JButton("8");
		eight.addActionListener(new ScientificCalculate.ButtonEightReaction());
		five = new JButton("5");
		five.addActionListener(new ScientificCalculate.ButtonFiveReaction());
		two = new JButton("2");
		two.addActionListener(new ScientificCalculate.ButtonTwoReaction());
		dot = new JButton(".");
		dot.addActionListener(new ScientificCalculate.ButtonDotReaction());
		nine = new JButton("9");
		nine.addActionListener(new ScientificCalculate.ButtonNineReaction());
		six = new JButton("6");
		six.addActionListener(new ScientificCalculate.ButtonSixReaction());
		three = new JButton("3");
		three.addActionListener(new ScientificCalculate.ButtonThreeReaction());
		multiply = new JButton("*");
		multiply.addActionListener(new ScientificCalculate.ButtonMultiplyReaction());
		divide = new JButton("/");
		divide.addActionListener(new ScientificCalculate.ButtonDivideReaction());
		plus = new JButton("+");
		plus.addActionListener(new ScientificCalculate.ButtonPlusReaction());
		minus = new JButton("-");
		minus.addActionListener(new ScientificCalculate.ButtonMinusReaction());
		equals = new JButton("=");
		equals.addActionListener(new ScientificCalculate.ButtonEqualsReaction());
		pi = new JButton("pi");
		pi.addActionListener(new ScientificCalculate.ButtonPiReaction());
		sqrt = new JButton("sqrt");
		sqrt.addActionListener(new ScientificCalculate.ButtonSqrtReaction());
		ln = new JButton("ln");
		ln.addActionListener(new ScientificCalculate.ButtonlnReaction());
		sin = new JButton("sin(x)");
		sin.addActionListener(new ScientificCalculate.ButtonSinReaction());
		cos = new JButton("cos(x)");
		cos.addActionListener(new ScientificCalculate.ButtonCosReaction());
		lbracket = new JButton("(");
		lbracket.addActionListener(new ScientificCalculate.ButtonLeftBracketReaction());
		rbracket = new JButton(")");
		rbracket.addActionListener(new ScientificCalculate.ButtonRightBracketReaction());

		panelkeys.add(seven);
		panelkeys.add(eight);
		panelkeys.add(nine);
		panelkeys.add(multiply);
		panelkeys.add(pi);
		panelkeys.add(sqrt);
		panelkeys.add(four);
		panelkeys.add(five);
		panelkeys.add(six);
		panelkeys.add(divide);
		panelkeys.add(ln);
		panelkeys.add(sin);
		panelkeys.add(one);
		panelkeys.add(two);
		panelkeys.add(three);
		panelkeys.add(plus);
		panelkeys.add(lbracket);
		panelkeys.add(cos);
		panelkeys.add(zero);
		panelkeys.add(dot);
		panelkeys.add(delete);
		panelkeys.add(minus);
		panelkeys.add(rbracket);
		panelkeys.add(equals);

	}

	public JTextField getDisplay() {
		return display;
	}

	public ArrayList<String> getText() {
		return text;
	}

}
