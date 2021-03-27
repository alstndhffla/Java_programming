package hello;

public class DoWhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {			// do 쪽을 한번 수행하고 while 문이 참이면 지속적으로 수행
			sum += num;
			num ++;
		}while(num <= 10);
		
		System.out.println("1부터 10까지의 합은 "+ sum);
	}
}
