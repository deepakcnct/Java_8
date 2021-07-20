package com.java.design.patterns.factory.abstractfactory;

import com.java.design.patterns.factory.Computer;
import com.java.design.patterns.factory.PC;

public class PCFactory implements ComputerAbstractFactory {
	
	public String RAM;
	public String HDD;
	public String CPU;
	
	public PCFactory(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {
		return new PC(this.RAM, this.HDD, this.CPU);
	}
}
