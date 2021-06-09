package sec06.exam05.package2;

	import sec06.exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1; //(o)
		a.field2 = 1; //(x)
		a.field3 = 1; //(x)
		
		a.method1(); //(o)
		a.method2(); //(x)
		a.method3(); //(x)
	}
}