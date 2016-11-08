package exam_01_composition;

import java.util.ArrayList;

public class BookService {

	//Method that executes Business Logic
	public ArrayList<BookEntity> getListByKeyword(String keyword) {
		
		// 로직처리
		// DB처리
		// The relation when a object is using another object
		// The service object creates another object(DAO) inside its method
		// This is called a Composition relationship
		// The two objects are connected very strongly -> Tightly Coupled
		// However, it is difficult to re-use the class and also very hard to maintain.
		// It is a contrasting act to the actual object oriented programming we were aiming to do.
		
		BookDAO dao=new BookDAO();
		ArrayList<BookEntity> list=dao.selectAll(keyword);
		return list;
	}

}
