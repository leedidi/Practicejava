package sec04.exam04;

public class QstopExample {
		public static void main(String[] args) throws Exception{
			int keyCode;
			
			while(true) {
				keyCode = System.in.read();
				System.out.println("keyCode: " + keyCode); //�ݺ� ����
				if(keyCode == 113) {
					break; //keycode�� 113�� ��� while �ݺ��� ������
				}
			}
			
			System.out.println("����");
		}
	}

//consoleâ���� �����Ϸ��� ��â ����Ŭ�� �Ŀ� �����ư>�Է��ϱ�