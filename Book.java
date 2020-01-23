
public class Book extends WrittenItem {
	
	public Book(int uniqueIdNo , String title , int noOfCopies , String author) {
		super(uniqueIdNo , title , noOfCopies , author);
	}
	
	public String physicalLibrary() {
		return super.getAuthor();
	}
	
	
}

