package com.java.design.patterns.solid.lsp;

public class LiskovSPDemo {
	public static void main(String[] args) {
		A b = new B();
		A c = new C();
	}
}


interface A {
	
}

class B implements A{
	
}

class C implements A{
	
}