package sec06.exam05.package1;

public class A {
	//�ʵ�
	public int field1; // public ���� ����
	int field2;			//default ���� ����
	private int field3; //private ���� ����
	
	//������
	public A() {
		field1 = 1; //(o)
		field2 = 1; //(o)
		field3 = 1; //(o)
		
		method1(); //(o)
		method2(); //(o)
		method3(); //(o)
	}
	
	//�޼ҵ�
	public void method1() {}
	void method2() {}
	private void method3() {}
}