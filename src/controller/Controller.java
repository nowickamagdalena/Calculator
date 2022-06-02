package controller;

import model.ScientificCalculate;
import model.SimpleCalculate;
import view.CalculatorGui;

public class Controller {
	private CalculatorGui gui;
	private ScientificCalculate stc;
	private SimpleCalculate smc;

	public Controller(CalculatorGui gui) {
		this.gui = gui;
		this.stc = new ScientificCalculate(gui.getScientificp());
		this.smc = new SimpleCalculate(gui.getSimplep());

	}

}
