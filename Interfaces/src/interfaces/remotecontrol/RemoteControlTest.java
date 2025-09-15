package interfaces.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		// 인터페이스형(부모 형)으로 인스턴스 생성(다형성)
		//RemoteControl remocon = new RemoteControl(); //불가
		RemoteControl remocon = new Television();
		
		//기능 테스트
		remocon.turnOn();
		remocon.setVolume(6);
		remocon.setVolume(20); //최대 볼륨으로 제한(10)
		remocon.setVolume(0); //최소 볼륨으로 제한(1)
		remocon.setMute(true); 
		remocon.setMute(false);
		remocon.turnOff();
		
		//배터리 교환
		RemoteControl.replaceBattery();

	}

}
