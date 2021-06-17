package sec02.exam05;

public class Example {
	public static void main(String[] args) {
		ImplementataionC impl = new ImplementataionC();
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}