package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		//예외가 발생할 수 있으므로 그 부분을 try 블록에 작성
		try{
			for(int i = 0; i<=5; i++){
				arr[i] = i;
				System.out.println(arr[i]);
			}
		//예외가 발생하면 catch 블록에서 수행.
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);	//예외를 발생시킨 값 출력.
			System.out.println("예외처리부분");
		}
		System.out.println("프로그램 종료");
	}
}
