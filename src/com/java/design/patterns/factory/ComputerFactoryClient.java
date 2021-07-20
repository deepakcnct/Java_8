package com.java.design.patterns.factory;

public class ComputerFactoryClient {
	
	public static void main(String[] arg) {
		
		Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1 GB", "256 GB", "Intel Core 2 Duo");
		
		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1 TB", "AMD Ryzen 7 2700x");
		
		System.out.println("PC :"+pc +"\nServer :"+ server);
	}
}
