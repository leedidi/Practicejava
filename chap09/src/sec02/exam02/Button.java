package sec02.exam02;

public class Button {
	OnClickListener listener;
	
	void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
}