package sec06.exam04.package1;

public class A {
	//�ʵ�
	A a1 = new A(true); //(o)
	A a2 = new A(1);	//(o)
	A a3 = new A("���ڿ�"); //(o)

	//������
	Public A(boolean b) {}
	A(int b) {}
	private A(String s) {} // �� A �������?
}
=