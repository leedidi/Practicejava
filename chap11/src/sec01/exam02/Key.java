package sec01.exam02;

public class Key {
	public int number;
	
	public key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key comparekey = (key) obj;
			if(this.number == comparekey.number) {
				return true;
			}
		}
		return false;
	}
}