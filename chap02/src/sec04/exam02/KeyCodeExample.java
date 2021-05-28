package sec04.exam02;

public class KeyCodeExample {
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	}
}
// 흠 왜 실행 안될까.....??
//예제파일 그대로 실행해도 실행안됨! 코드 잘못친 문제는 아닌듯
//오 정지 누르면 결과 나옴 무한히 실행중.....?
//아 A를 입력한걸 인식해야 하는거 같은데 A를 어디에 입력하지...?
//아 아래 console에 입력하면 됐음!!!