package exam_01_aggregation;

//A class that makes DTO
//Makes DTO according to the Database
public class BookEntity {

	private String bisbn;
	private String btitle;
	private String bauthor;	//It must be a private as to prevent users from editting the data. Use getter, setter.
	private int bprice;		//The name of the field should be equal to the column name of the Database
	
	public BookEntity(){
		
	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public int getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	
}
