package thisex;

class Person{
	String name;
	int age;
	
	Person(){	//디폴트 생성자 선언
		this("이름없음", 1);
	}
	
	Person(String name, int age){	//this
		this.name = name;
		this.age = age;		
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
