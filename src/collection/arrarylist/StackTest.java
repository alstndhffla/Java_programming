package collection.arrarylist;

import java.util.ArrayList;

//arraylist로 스택 구현하기(나중에 들어간게 제일 먼저 나온다 - 탑쌓기)

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	//스택 맨 뒤에 요소 추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	//스택의 맨 뒤에서 요소 빼기
	public String pop() {
		int len = arrayStack.size();	//ArrayList에 저장된 유효한 자료의 개수
		if(len == 0) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		return(arrayStack.remove(len-1));	//맨 뒤에 있는 자료 반환하고 배열에서 제거
	}
}


public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		//스택에 추가
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		
		//맨 마지막부터 하나씩 제거되는 요소 표시
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
