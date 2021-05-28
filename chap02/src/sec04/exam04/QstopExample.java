package sec04.exam04;

public class QstopExample {
		public static void main(String[] args) throws Exception{
			int keyCode;
			
			while(true) {
				keyCode = System.in.read();
				System.out.println("keyCode: " + keyCode); //반복 실행
				if(keyCode == 113) {
					break; //keycode가 113일 경우 while 반복을 중지합
				}
			}
			
			System.out.println("종료");
		}
	}

//console창에서 실행하려면 이창 더블클릭 후에 실행버튼>입력하기