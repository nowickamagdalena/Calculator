package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import view.SimplePanel;

public class SimpleCalculate {

	private static double a;
	private static double b;
	private static int action;
	private static boolean newEquation;
	private static JTextField display;

	public SimpleCalculate(SimplePanel sp) {
		a = 0;
		b = 0;
		action = 0;
		newEquation = false;
		display = sp.getDisplay();
	}

	public static class ButtonOneReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("1");
			newEquation = false;
		}
	}

	public static class ButtonTwoReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("2");
			newEquation = false;
		}
	}

	public static class ButtonThreeReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("3");
			newEquation = false;
		}
	}

	public static class ButtonFourReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("4");
			newEquation = false;
		}
	}

	public static class ButtonFiveReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("5");
			newEquation = false;
		}
	}

	public static class ButtonSixReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("6");
			newEquation = false;
		}
	}

	public static class ButtonSevenReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("7");
			newEquation = false;
		}
	}

	public static class ButtonEightReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("8");
			newEquation = false;
		}
	}

	public static class ButtonNineReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("9");
			newEquation = false;
		}
	}

	public static class ButtonZeroReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("0");
			newEquation = false;
		}
	}

	public static class ButtonDotReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText(".");
			newEquation = false;
		}
	}

	public static class ButtonEqualsReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			saveSecond();
			display.setText("");
			double result = 0;
			switch (action) {
			// adding
			case 1:
				result = a + b;
				display.setText(Double.toString(result));
				break;
			// substracting
			case 2:
				result = a - b;
				display.setText(Double.toString(result));
				break;
			// multiplying
			case 3:
				result = a * b;
				display.setText(Double.toString(result));
				break;
			// dividing
			case 4:
				result = a / b;
				display.setText(Double.toString(result));
				break;
			default:
				action = 0;
			}
			newEquation = true;
		}
	}

	public static class ButtonPlusReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			saveFirst();
			saveAction(1);
			newEquation = true;
		}
	}

	public static class ButtonMinusReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			saveFirst();
			saveAction(2);
			newEquation = true;
		}
	}

	public static class ButtonTimesReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			saveFirst();
			saveAction(3);
			newEquation = true;
		}
	}

	public static class ButtonDivideReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			saveFirst();
			saveAction(4);
			newEquation = true;
		}
	}

	public static class ButtonDeleteReaction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			display.setText("");
			a = 0;
			b = 0;
			action = 0;
		}
	}

	public static void setText(String s) {
		display.setText(display.getText() + s);
	}

	public static void saveFirst() {
		a = Double.parseDouble(display.getText());
	}

	public static void saveSecond() {
		b = Double.parseDouble(display.getText());
	}

	public static void saveAction(int x) {
		switch (x) {
		// adding
		case 1:
			action = 1;
			break;
		// substracting
		case 2:
			action = 2;
			break;
		// multiplying
		case 3:
			action = 3;
			break;
		// dividing
		case 4:
			action = 4;
			break;
		default:
			action = 0;
		}
	}

}
