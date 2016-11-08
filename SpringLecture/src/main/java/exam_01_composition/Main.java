package exam_01_composition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 입력받기
		Scanner s=new Scanner(System.in);
		System.out.print("Keyword to Search: ");
		String keyword=s.nextLine();
				
		// 로직처리
		// 로직처리를 위한 서비스 객체 생성
		BookService service=new BookService();
		
		//서비스를 이용해서 비즈니스 로직(The name of the service method should represent the business logic)을 수행
		ArrayList<BookEntity> list=service.getListByKeyword(keyword);
		
		
		// 출력처리
		for(BookEntity entity:list){
			System.out.println(entity.getBtitle()+ " : "+ entity.getBauthor());
		}
		
		//사용한 리소스 해제
		s.close();
		
	}

}
