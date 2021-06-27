package sec02.exam01;

	import java.text.*;
	import java.util.*;
	
public class DataEample {
	public static void main(String[] args) {
		Date now = new Date();
		Date StrNow1 = new Date();
		System.out.println(StrNow1);
		
		SimpleDateFormat sdf =
			new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
			String strNow2 = sdf.format(now);
			System.out.println(strNow2);
	}
}