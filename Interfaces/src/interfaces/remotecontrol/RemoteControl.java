package interfaces.remotecontrol;

/*
 * interface는 접근 제어 속성 - public
   - 변수를 선언하면 상수로 변환(public static final 형)
   - defalt가 있는 메서드 - 실체 메서드(구현부가 있음)
 */
public interface RemoteControl {
	//상수 선언
	public int MAX_VOLUME = 10;  //최대값
	public int MIN_VOLUME = 1;   //최소값

	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//실체 메서드 사용 가능 - default 접두어 사용
	public default void setMute(boolean mute) {
		System.out.println(mute ? "무음 모드 활성화" : "무음 모드 해제");
	}
	
	//정적 메서드 
	public static void replaceBattery() {
		System.out.println("배터리를 교환합니다.");
	}
}








