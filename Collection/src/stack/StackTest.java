package stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		//정수를 저장할 Stack 객체 생성
		Stack<Integer> stk = new Stack<>();
		
		//요소 추가 (10 - 20 - 30)
		stk.push(10);
		stk.push(20);
		stk.push(30);
		
		//인덱싱 - 요소 접근 불가
		//stk[0];
		
		//맨 위의 요소 출력 - peek()
		/*System.out.println(stk.peek()); //30
		//요소 삭제
		stk.pop();
		System.out.println(stk.peek()); //20
		stk.pop();
		System.out.println(stk.peek()); //10
		stk.pop();
		
		System.out.println(stk.peek()); //예외 발생*/
		
		//안전한 삭제
		while(!stk.isEmpty()) {
			System.out.println(stk.peek());
			stk.pop();
		}
	}

}
