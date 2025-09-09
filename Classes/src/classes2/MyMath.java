package classes2;

public class MyMath {
	
	//public MyMath() {}
	
	//절대값 계산 메서드 정의
	public static int abs(int x) {
		return (x < 0) ? -x : x;
	}
	
	//두 수중 작은수 찾기 메서드 
	public static int min(int x, int y) {
		//return (x <= y) ? x : y;
		if(x <= y)
			return x;
		else
			return y;
	}
}
