package com.java.design.patterns.factory.abstractfactory;

import com.java.design.patterns.factory.Computer;

public class ComputerFactory {
	
	public static Computer createComputer(ComputerAbstractFactory caf) {
		return caf.createComputer();
	}
}
