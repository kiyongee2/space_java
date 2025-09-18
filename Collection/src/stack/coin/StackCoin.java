package stack.coin;

import java.util.Stack;

public class StackCoin {

	public static void main(String[] args) {
		// 동전을 저장할 Stack 객체 생성
		Stack<Coin> coinBox = new Stack<>();
		
		//동전 객체 생성
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin10 = new Coin(10);
		
		//넣기 (500 - 100 - 50 - 10)
		coinBox.push(coin500);
		coinBox.push(coin100);
		coinBox.push(coin50);
		coinBox.push(coin10);
		
		//맨 위 요소 출력
		//System.out.println(coinBox.pop().getValue() + "원"); //10
		
		//빼기 ( 10 - 50 - 100 - 500)
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getValue() + "원");
		}
		
	}

}
