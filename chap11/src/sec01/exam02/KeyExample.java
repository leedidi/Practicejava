package sec01.exam02;

public class KeyExample {
	public static void main(String[] args) {
		// Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		MashMap>key, Sring> hashMap = new HashMap<key, String>();
		
		//�ĺ�Ű new Key(1)�� "ȫ�浿"�� ������
		hashMap.put(new Key(1), "ȫ�浿");
		
		//�ĺ�Ű new Key(1)�� "ȫ�浿"�� �о��
		String value = hashMap.get(new key(1));
		System.out.println(value);
	}
}