package sec02.exam05;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m=2; m<=9; m++) { // 바깥쪽 for 문
			System.out.println("*** " + m + "단 ***"); ///와 구구단이다!!
			for (int n=1; n<=9; n++) { //중첩 for 문
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}