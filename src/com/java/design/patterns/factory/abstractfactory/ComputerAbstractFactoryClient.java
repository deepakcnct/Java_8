package com.java.design.patterns.factory.abstractfactory;

import com.java.design.patterns.factory.Computer;

public class ComputerAbstractFactoryClient {
	
	public static void main(String[] arg) {
		
		Computer pc = ComputerFactory.createComputer(new PCFactory("1 GB", "256 GB", "Intel Core 2 Duo"));
		
		Computer server = ComputerFactory.createComputer(new ServerFactory("32GB", "1 TB", "AMD Ryzen 7 2700x"));
		
		System.out.println("PC :"+pc +"\nServer :"+ server);
	}
}
