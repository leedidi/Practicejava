package sec01.exam06;

import sec01.exam03.RemoteControl;

public class Myclass {
	//�ʵ�
	RemoteControl rc = new Television();
	
	//������
	Myclass() {
	}
	
	Myclass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//�޼ҵ�
	void methodA( ) {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}