package com.java.design.patterns.factory;

public class PC implements Computer{
	
	public String RAM;
	public String HDD;
	public String CPU;
	
	public PC(String ram, String hdd, String cpu) {
		RAM = ram;
		HDD = hdd;
		CPU = cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "PC [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}
}
