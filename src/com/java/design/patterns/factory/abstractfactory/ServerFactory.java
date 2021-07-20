package com.java.design.patterns.factory.abstractfactory;

import com.java.design.patterns.factory.Computer;
import com.java.design.patterns.factory.Server;

public class ServerFactory implements ComputerAbstractFactory {
	
	public String RAM;
	public String HDD;
	public String CPU;
	
	public ServerFactory(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {
		return new Server(this.RAM, this.HDD, this.CPU);
	}
}
