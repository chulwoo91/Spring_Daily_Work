package exam_02_beans_xml_tag;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String config="classpath:applicationCtx_beans_xml_tab.xml";
		
		AbstractApplicationContext ctx= new GenericXmlApplicationContext(config);
		
		BookShelf shelf=ctx.getBean("bookshelf", BookShelf.class);
		
		System.out.println("책장이름: " + shelf.getShelfName());
		System.out.println("책장가격: " + shelf.getShelfPrice());
		for(BookEntity entity:shelf.getList()){
			System.out.println(entity.getBtitle() + " : " + entity.getBauthor());
		}
		Set<Integer> keyset=shelf.getMap().keySet(); //key값을 다 받아와서 key값에 해당하는 책 이름을 뽑아낼 수 있다.
		for(Integer i:keyset){
			System.out.println(shelf.getMap().get(i).getBtitle());
		}
	}

}
