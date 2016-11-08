package exam_01_aggregation;

import java.util.ArrayList;

public interface DAO {

	ArrayList<BookEntity> selectAll(String keyword);	//인터페이스를 통해 class간의 관계가 약해진다.

}
