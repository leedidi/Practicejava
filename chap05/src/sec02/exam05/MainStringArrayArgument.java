package sec02.exam05;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length !=2) { //입력된 데이터 개수가 2개가 아닐 경우
			System.out.println("값의 수가 부족합니다.");
			
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
	}

		int result = num1 + num2; //컴파일 오류!
		System.out.println(num1 + " + " + num2 + " = " + result);
}