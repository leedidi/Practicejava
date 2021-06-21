package sec01.exam02;

public class ArrayIndexOutOfBonudsExceptionExample {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}
//run configuration에 매개값 입력하면 예외 발생 X 신기하다..!