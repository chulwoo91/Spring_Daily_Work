package hahaha;

public class Main {

	public static void main(String[] args) {
		
		//IS-A관계(is-a relationship)
		//정의: subclass is a superclass(O)
		//역관계는 성립하지 않는다. superclass is a subclass(X)
		//subclass의 type을 써야하는 곳에서는 superclass의 type을 써도 된다.
		
		Student a=new Student();
		Person b=new Student(); //하위 타입에서 상위 타입으로 casting이 가능하다.
		Object c=new Student();

	}

}
