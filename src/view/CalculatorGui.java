package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import controller.Controller;

public class CalculatorGui {

	private JFrame frame;
	private JTabbedPane tabs;
	private SimplePanel simplep;
	private ScientificPanel scientificp;
	private Controller control;

	public CalculatorGui() {

		frame = new JFrame("Calculator");

		tabs = new JTabbedPane();
		simplep = new SimplePanel();
		tabs.add("Simple", simplep);
		scientificp = new ScientificPanel();
		tabs.add("Scientific", scientificp);
		frame.getContentPane().add(BorderLayout.CENTER, tabs);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);

		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int frameHeight = frame.getHeight();
		int frameWidth = frame.getWidth();

		frame.setLocation((screenWidth - frameWidth) / 2, (screenHeight - frameHeight) / 2);

		control = new Controller(this);

	}

	public SimplePanel getSimplep() {
		return simplep;
	}

	public ScientificPanel getScientificp() {
		return scientificp;
	}

}
