package collection.linkedlist;

import java.util.LinkedList;

//리스트 계열은 언제나 인덱스 0부터 시작한다.
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("a");
		myList.add("b");
		myList.add("c");		
		System.out.println(myList);
		
		myList.add(1, "d");		// 링크드 리스트의 첫번째 위치에 d 추가
		System.out.println(myList);
		
		myList.addFirst("o");	//링크드리스트 맨 앞에 o 추가
		System.out.println(myList);
		
		System.out.println(myList.removeLast());	//링크드 리스트 맨 뒤 요소 숙제 후 해당요소 출력
		System.out.println(myList);
	}
}
