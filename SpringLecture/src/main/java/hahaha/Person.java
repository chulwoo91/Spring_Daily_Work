package hahaha;

public class Person {
	
	//1. 변수 -> field 
	//2. 함수 -> method
	//3. 생성자 -> 만들어진 instance를 초기화 시켜주는 역할
	
	private int age;	//객체지향 개념중 information hiding이라는 개념을 java언어에서 access modifier인 private으로 구현.
						//외부에서 해당 field를 제어하기 위해 getter와 setter라는 method를 통해 해당 field 제어.
	public Person() {
		//default 생성자
	}
	
	//business logic을 처리하기 위한 method
	public void printAge(){
		
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
