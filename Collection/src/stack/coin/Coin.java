package stack.coin;
/*
    - Stack 자료구조를 응용한 동전 박스 만들기
 */
public class Coin {
	
	private int value; //동전
	
	public Coin(int value) {
		this.value = value;
	}
	
	//동전 반환
	public int getValue() {
		return value;
	}
	
}
