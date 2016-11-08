package exam_01_composition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	
	//Only executes Database
	public ArrayList<BookEntity> selectAll(String keyword) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<BookEntity> list=null;

		try {
			//1. Driver Loading
			Class.forName("com.mysql.jdbc.Driver");

			//2. Connect to the Database
			String url="jdbc:mysql://localhost:3306/library";
			String id="teddy";
			String pw="teddy";
			con=DriverManager.getConnection(url, id, pw);
	
			//3. Create a PreparedStatement that has SQL
			String sql="select bisbn, btitle, bauthor from book where btitle like ?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,  "%" + keyword + "%");
			
			//4. Execute Query
			rs=pstmt.executeQuery();
			
			//5. Handle result
			//create the data from the database into ArrayList<BookEntity> form
			list=new ArrayList<BookEntity>();

			while(rs.next()){
				System.out.println(rs.getString("bisbn"));
				BookEntity entity=new BookEntity();
				entity.setBisbn(rs.getString("bisbn"));
				entity.setBtitle(rs.getString("btitle"));
				entity.setBauthor(rs.getString("bauthor"));
				
				list.add(entity);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally{
			//Closing down the resources used in the order of latest use
			try {
				rs.close();
				pstmt.close();
				con.close();				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return list;
		
	}

}
