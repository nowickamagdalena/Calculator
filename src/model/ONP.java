package model;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Obiekt przeksztalca dzialanie na odwrotna notacja polska i zwraca wynik
 * dzialania
 * 
 * @author Wojtek
 * @version 1.0
 * 
 */
public class ONP {
	private static Stack<String> stack = new Stack<String>();
	private static ArrayList<String> text = ScientificCalculate.getText();
	private static ArrayList<String> onp = new ArrayList<String>();

	public static void convertToONP() {
		int i = 0;
		while (i < text.size()) {
			String element = text.get(i);

			if (element.equals("ln") || element.equals("sin") || element.equals("cos") || element.equals("sqrt")) {
				stack.add(element);
			} else {
				if (element.equals("+") || element.equals("-") || element.equals("/") || element.equals("*")) {
					if (element.equals("+") || element.equals("-")) {
						while (!stack.empty() && (stack.peek().equals("*") || stack.peek().equals("/")
								|| stack.peek().equals("+") || stack.peek().equals("-"))) {
							onp.add(stack.peek());
							stack.pop();
						}
					}
					if (element.equals("*") || element.equals("/")) {
						while (!stack.empty() && (stack.peek().equals("*") || stack.peek().equals("/"))) {
							onp.add(stack.peek());
							stack.pop();
						}
					}
					stack.add(element);
				} else {
					if (element.equals("("))
						stack.add(element);
					else {
						if (element.equals(")")) {
							while (!stack.empty() && !stack.peek().equals("(")) {
								onp.add(stack.pop());
							}
							if (stack.empty()) {
								ScientificCalculate.error();
								return;
							} else {
								if (stack.peek().equals("("))
									stack.pop();
								else {

									if (!stack.empty() && (stack.peek().equals("ln") || stack.peek().equals("sin")
											|| stack.peek().equals("cos") || stack.peek().equals("sqrt"))) {
										onp.add(stack.peek());
										stack.pop();
									}
								}
							}

						}
					}
				}
				if (!element.equals("ln") && !element.equals("sin") && !element.equals("cos") && !element.equals("sqrt")
						&& !element.equals("+") && !element.equals("-") && !element.equals("/") && !element.equals("*")
						&& !element.equals(")") && !element.equals("(")) {
					String s = element;
					while (i != (text.size() - 1) && !(text.get(i + 1).equals("ln") || text.get(i + 1).equals("sin")
							|| text.get(i + 1).equals("cos") || text.get(i + 1).equals("sqrt")
							|| text.get(i + 1).equals("+") || text.get(i + 1).equals("-") || text.get(i + 1).equals("/")
							|| text.get(i + 1).equals("*") || text.get(i + 1).equals(")")
							|| text.get(i + 1).equals("("))) {
						s += text.get(i + 1);
						i++;
					}
					onp.add(s);
				}
			}
			i++;
		}
		while (!stack.empty()) {
			onp.add(stack.pop());
		}
	}

	public static String calculate() {
		int i = 0;
		while (i < onp.size()) {

			String element = onp.get(i);

			if (!element.equals("ln") && !element.equals("sin") && !element.equals("cos") && !element.equals("sqrt")
					&& !element.equals("+") && !element.equals("-") && !element.equals("/") && !element.equals("*")) {
				stack.add(element);
			}
			if (element.equals("ln")) {
				if (Double.parseDouble(stack.peek()) <= 0 || stack.empty()) {
					return null;
				}
				Double result = Math.log(Double.parseDouble(stack.peek()));
				stack.pop();
				stack.add(result.toString());
			}
			if (element.equals("sin")) {
				Double result = Math.sin(Double.parseDouble(stack.peek()));
				stack.pop();
				stack.add(result.toString());
			}
			if (element.equals("cos")) {
				Double result = Math.cos(Double.parseDouble(stack.peek()));
				stack.pop();
				stack.add(result.toString());
			}
			if (element.equals("sqrt")) {
				if (Double.parseDouble(stack.peek()) < 0) {
					return null;
				}
				Double result = Math.sqrt(Double.parseDouble(stack.peek()));
				stack.pop();
				stack.add(result.toString());
			}
			if (element.equals("+")) {
				double a = Double.parseDouble(stack.peek());
				stack.pop();
				double b = Double.parseDouble(stack.peek());
				stack.pop();
				Double result = a + b;
				stack.add(result.toString());
			}
			if (element.equals("-")) {
				double a = Double.parseDouble(stack.peek());
				stack.pop();
				double b = 0;
				if (stack.empty() || stack.peek().equals("ln") || stack.peek().equals("sin")
						|| stack.peek().equals("cos") || stack.peek().equals("sqrt")) {
					b = 0;
				} else {
					b = Double.parseDouble(stack.pop());
				}
				Double result = b - a;
				stack.add(result.toString());
			}
			if (element.equals("*")) {
				double a = Double.parseDouble(stack.peek());
				stack.pop();
				double b = Double.parseDouble(stack.peek());
				stack.pop();
				Double result = a * b;
				stack.add(result.toString());
			}
			if (element.equals("/")) {
				if (Double.parseDouble(stack.peek()) == 0) {
					return null;
				}
				double a = Double.parseDouble(stack.peek());
				stack.pop();
				double b = Double.parseDouble(stack.peek());
				stack.pop();
				Double result = b / a;
				stack.add(result.toString());
			}
			i++;
		}
		return stack.peek();
	}

	public static void clear() {
		stack.removeAll(stack);
		onp.removeAll(onp);
	}

}
