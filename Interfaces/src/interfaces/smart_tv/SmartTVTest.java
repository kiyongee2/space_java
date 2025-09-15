package interfaces.smart_tv;

import interfaces.remotecontrol.RemoteControl;

public class SmartTVTest {

	public static void main(String[] args) {
		// 인터페이스 타입으로 인스턴스 생성
		RemoteControl remocon = new SmartTV();
		//WebSearchable searcher = new SmartTV();
		WebSearchable searcher = (WebSearchable)remocon;
		
		//기능 테스트
		remocon.turnOn();
		remocon.setVolume(6);
		remocon.setVolume(20); //최대 볼륨으로 제한(10)
		remocon.setVolume(0); //최소 볼륨으로 제한(1)
		remocon.setMute(true); 
		remocon.setMute(false);
		remocon.turnOff();
		
		//검색 기능 테스트
		searcher.searchWeb("www.youtube.com");
		
		//배터리 교환
		RemoteControl.replaceBattery();
	}
}
