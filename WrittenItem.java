
public abstract class WrittenItem extends Item{
	
	private String author;
	
	
	public WrittenItem(int uniqueIdNo , String title , int noOfCopies , String author  ) {
		
		super(uniqueIdNo ,title ,noOfCopies);
		this.author = author ;
		
	} 
	
	
	public abstract String physicalLibrary();
	
	public int computeSalePrice() {
		return super.getNoOfCopies();
	}

	public String getAuthor() {
		return author; 
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}
