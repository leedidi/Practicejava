package sec01.exam07;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCulculator(calculator);
		user1.start1();
		
		User2.user2 = new User2();
		user2.setCalculator(calculaotr);
		user2.start();
	}
}