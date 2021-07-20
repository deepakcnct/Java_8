package com.java.design.patterns.factory;

public class ComputerFactory {
	
	public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {
		Computer comp = null;
		
		switch(type) {
		case PC:
			comp = new PC(ram, hdd, cpu);
		case SERVER:
			comp = new Server(ram, hdd, cpu);
		}
		
		return comp;
	}
}
