package dailyWork1;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//입력받은 키워드를 이용해서 저자와 제목을 출력하는데, comment가 존재하면 같이 출력한다.
		
	    System.out.print("Enter the Keyword:");
		Scanner s=new Scanner(System.in);
		String keyword=s.nextLine(); //nextLine은 공백을 포함해서 사용자가 입력한 모든 값을 받는다. next를 사용하면 공백에서 끊긴다. 
	
		
		//config 파일에 대한 경로를 문자열로 저장
		//xml 파일은 여러개 만들어 줘도 된다. 여러 개로 만들어진 xml 파일은 IoC Container에 다 넣어서 사용할 수 있다.
		String config="classpath:applicationCtx.xml";
		
		//IoC Container 만드는 방법
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(config); //(config, config1) 이렇게 추가해서 사용 가능.
		
		BookService service= ctx.getBean("bookService", BookService.class); //ctx가 bookService라는 이름의 bean을 가져와 사용하고, BookService class의 타입을 사용하는 것
		
		ArrayList<BookEntity> list=service.getListByKeyword(keyword);
		
		for(BookEntity entity:list){
			System.out.println(entity.getBtitle() + " : " + entity.getBauthor());
			entity.printCtext();
			
		}

		ctx.close();
		s.close();

	}

}
