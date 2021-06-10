package sec01.exam02;

public class Student extends People {
	public int studentNO;
	
	public Student(String name, String ssn, int sudentNo) {
		super(name, ssn);
		this.studentNO = studentNo;
	}

}