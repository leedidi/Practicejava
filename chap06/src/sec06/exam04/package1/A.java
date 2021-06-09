package sec06.exam04.package1;

public class A {
	//필드
	A a1 = new A(true); //(o)
	A a2 = new A(1);	//(o)
	A a3 = new A("문자열"); //(o)

	//생성자
	Public A(boolean b) {}
	A(int b) {}
	private A(String s) {} // 왜 A 오류뜰까?
}
=