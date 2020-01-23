
public class JournalPaper extends WrittenItem {

	private int yearPublished;
	
	public JournalPaper(int uniqueIdNo , String title , int noOfCopies , String author , int yearPublished) {
		super(uniqueIdNo , title , noOfCopies , author);
		this.yearPublished = yearPublished;
	}
	
	public String physicalLibrary() {
		return super.getAuthor();
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	
}

