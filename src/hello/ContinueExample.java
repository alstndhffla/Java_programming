package hello;

//홀수 일 때만 더하고 짝수일 때는 더하지 않는.
public class ContinueExample {
	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0)
				continue;
			total += num;			
		}
		System.out.println(total);
	}
}
