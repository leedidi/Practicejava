package sec01.exam04;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integar.parseInt(data1);
		int value2 = Integar.parseInt(data2); //NumberFormatException �߻�
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}