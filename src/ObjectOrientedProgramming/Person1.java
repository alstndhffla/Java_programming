package ObjectOrientedProgramming;

public class Person1 {
	String name;
	float height;
	float weight;	
	
	public Person1() {} //디폴트 생성자
	
	
	public Person1(String pname) {
		name = pname;
	}
	
	public Person1(String pname, float pheight, float pweight) {	//메서드 오버로드(매개변수가 다른것. 메서드 이름은 같고)
		name = pname;
		height = pheight;
		weight = pweight;
		
	}
}
