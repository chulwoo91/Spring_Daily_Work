package dailyWork1;

import java.util.ArrayList;

public class BookService {

	private BookDAO dao; //dao에 값을 주입하는 것은 applicationCtx.xml이 한다. dao는 이 필드의 이름이다.
	private String keyword;
	
	public BookService(){
		//default constructor는 무조건 항상 만들어 두는 것이 좋다.
	}
	
	public BookService(BookDAO dao){	//이것을 constructor injection이라고 한다.
		this.dao=dao;
	}
	
	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public ArrayList<BookEntity> getListByKeyword(String keyword) {
		return dao.selectAll(keyword);
	}
	
}
