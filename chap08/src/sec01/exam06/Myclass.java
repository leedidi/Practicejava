package sec01.exam06;

import sec01.exam03.RemoteControl;

public class Myclass {
	//필드
	RemoteControl rc = new Television();
	
	//생성자
	Myclass() {
	}
	
	Myclass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드
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