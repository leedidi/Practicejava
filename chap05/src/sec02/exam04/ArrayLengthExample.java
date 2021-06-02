package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87}; // 83 87 전후에 띄는건 가독성 위해서일까 공식일까..? > 실험해본결과 가독성 위해서인듯!
		
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		}
}