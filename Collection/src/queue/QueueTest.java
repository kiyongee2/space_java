package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// Queue를 활용한 은행 대기줄 구현
		Queue<String> queue = new LinkedList<>();
		
		//고객 저장 - offer()
		queue.offer("고객A");
		queue.offer("고객B");
		queue.offer("고객C");
		
		//맨 앞 요소 출력
		//System.out.println(queue.peek()); //고객A
		
		//고객 꺼내기
		while(!queue.isEmpty()) {
			System.out.println(queue.peek() + "님 업무 처리중...");
			queue.poll(); //삭제
		}
		System.out.println("모든 고객의 업무가 완료되었습니다.");

	}

}
