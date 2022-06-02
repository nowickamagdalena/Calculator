package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import view.ScientificPanel;

public class ScientificCalculate {

	private static JTextField display;
	private static ArrayList<String> text;
	private static boolean newEquation = true;
	private static boolean error = false;

	public static JTextField getDisplay() {
		return display;
	}

	public static ArrayList<String> getText() {
		return text;
	}

	public ScientificCalculate(ScientificPanel sp) {
		display = sp.getDisplay();
		text = sp.getText();

	}

	public static void error() {
		ONP.clear();
		display.setText("ERROR");
		newEquation = true;
		error = true;

	}

	public static class ButtonOneReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("1");
			text.add("1");
			newEquation = false;
		}
	}

	public static class ButtonTwoReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("2");
			text.add("2");
			newEquation = false;
		}
	}

	public static class ButtonThreeReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("3");
			text.add("3");
			newEquation = false;
		}
	}

	public static class ButtonFourReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("4");
			text.add("4");
			newEquation = false;
		}
	}

	public static class ButtonFiveReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("5");
			text.add("5");
			newEquation = false;
		}
	}

	public static class ButtonSixReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("6");
			text.add("6");
			newEquation = false;
		}
	}

	public static class ButtonSevenReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("7");
			text.add("7");
			newEquation = false;
		}
	}

	public static class ButtonEightReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("8");
			text.add("8");
			newEquation = false;
		}
	}

	public static class ButtonNineReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("9");
			text.add("9");
			newEquation = false;
		}
	}

	public static class ButtonZeroReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("0");
			text.add("0");
			newEquation = false;
		}
	}

	public static class ButtonDotReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText(".");
			text.add(".");
			newEquation = false;
		}
	}

	public static class ButtonDeleteReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display.setText("");
			text.removeAll(text);
			ONP.clear();
			newEquation = true;
		}
	}

	public static class ButtonPlusReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			setText("+");
			text.add("+");
			newEquation = false;
		}
	}

	public static class ButtonMinusReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("-");
			text.add("-");
			newEquation = false;
		}
	}

	public static class ButtonDivideReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("/");
			text.add("/");
			newEquation = false;
		}
	}

	public static class ButtonMultiplyReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation)
				display.setText("");
			setText("*");
			text.add("*");
			newEquation = false;
		}
	}

	public static class ButtonLeftBracketReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("(");
			text.add("(");
			newEquation = false;
		}
	}

	public static class ButtonRightBracketReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText(")");
			text.add(")");
			newEquation = false;
		}
	}

	public static class ButtonlnReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("ln(");
			text.add("ln");
			text.add("(");
			newEquation = false;
		}
	}

	public static class ButtonSinReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("sin(");
			text.add("sin");
			text.add("(");
			newEquation = false;
		}
	}

	public static class ButtonCosReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("cos(");
			text.add("cos");
			text.add("(");
			newEquation = false;
		}
	}

	public static class ButtonPiReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText(((Double) Math.PI).toString());
			text.add(((Double) Math.PI).toString());
			newEquation = false;
		}
	}

	public static class ButtonEqualsReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ONP.convertToONP();
			if (!error) {
				display.setText(ONP.calculate());
				if (ONP.calculate() == null)
					error();
				ONP.clear();
				text.add(display.getText());
				newEquation = true;
				error = false;
			}
		}
	}

	public static class ButtonSqrtReaction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (newEquation) {
				display.setText("");
				text.removeAll(text);
			}
			setText("sqrt(");
			text.add("sqrt");
			text.add("(");
			newEquation = false;
		}
	}

	public static void setText(String s) {
		display.setText(display.getText() + s);
	}

}
