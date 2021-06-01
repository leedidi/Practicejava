package sec02.exam02;

public class Arra7CreateByValueListExample {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		
		int sum2 = add( new int[] { 83, 90, 87 } ) ;
		System.out.println("총합 : " + sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) { // 왜 오류나지....? 아 p 대문자였음!
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
} 