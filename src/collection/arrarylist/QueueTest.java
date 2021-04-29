package collection.arrarylist;

import java.util.ArrayList;

//arraylist로 큐 구현하기
class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	//큐의 맨 뒤에 추가
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	//큐의 맨 앞에서 꺼냄
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("코가 비었습니다.");
			return null;
		}
		return(arrayQueue.remove(0));	//인덱스 맨 앞에 것(0번)을 제거
	}
}

public class QueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		//큐에 하나씩 추가됨
		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");
		
		//큐의 맨 앞부터 제거되는 요소 출력
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
