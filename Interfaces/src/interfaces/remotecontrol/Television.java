package interfaces.remotecontrol;

//RemoteControl 인터페이스 구현한 클래스
public class Television implements RemoteControl{
	//멤버 변수 - volume, isPoweredOn
	private int volume;  //볼륨의 크기
	private boolean isPoweredOn; //기본이 false임, 상태변수(토글 기능)

	@Override
	public void turnOn() {
		if(!isPoweredOn) {//!false -> true
			isPoweredOn = true;
		}
		System.out.println("TV를 켭니다. 현재 상태: ON");
	}

	@Override
	public void turnOff() {
		if(isPoweredOn) { //isPowered = true
			isPoweredOn = false;
		}
		System.out.println("TV를 끕니다. 현재 상태: OFF");
	}

	@Override
	public void setVolume(int volume) {
		//볼륨 크기 제한
		if(volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;  //최대 볼륨 설정
		else if(volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;  //최소 볼륨 설정
		else
			this.volume = volume;
		
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
