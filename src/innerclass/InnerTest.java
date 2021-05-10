package innerclass;

class OutClass {	//외부 클래스

	private int num = 10;	//외부 클래스의 private 변수
	private static int sNum = 20;	//외부 클래스의 정적 변수
	private InClass inClass;	//내부 클래스 자료형 변수를 먼저 선언.
	
	//외부 클래스 디폴트 생성자. 외부 클래스가 생성된 후에 내부 클래스 생성가능
	public OutClass(){
		inClass = new InClass(); 
	}
	
	//인스턴스 내부 클래스
	class InClass{
		
		int inNum = 100;	//내부 클래스의 인스턴스 변수.
		//static int sInNum = 200;  //인스턴스 내부 클래스에 정적 변수 선언 불가능. 오류가 발생하므로 주석 처리함.
		
		void inTest(){	//내부 클래스의 메서드
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
		
	    //static void sTest(){  //정적 메서드 역시 정의 불가능. 오류가 발생함.
	    	
	    //}
		
	}
	
	public void usingClass(){
		inClass.inTest(); //
	}
	
	static class InStaticClass{
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest(){   //정적 내부 클래스의 일반 메서드
			//num += 10;    //외부 클래스의 인스턴스 변수는 사용할 수 없으므로 주석 처리
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)"); 
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		static void sTest(){	//정적 내부 클래스의 정적 메서드
			//num += 10;   //외부 클래스와 내부 클래스의 인스턴스 변수는 사용할 수 없으므로 주석 처리
			//inNum += 10; //위와 같음.
			
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			
		}
	}	
}


public class InnerTest{
	
	public static void main(String[] args){
	
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();    //내부 클래스 기능 호출.
	    System.out.println();
	    
	/*	OutClass.InClass inClass = outClass.new InClass();   // �ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ����
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
		inClass.inTest();
		
		System.out.println();
		
		//외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성가능
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();  
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
		*/
	}
}