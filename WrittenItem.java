
public abstract class WrittenItem extends Item{
	
	private String author;
	
	
	public WrittenItem(int uniqueIdNo , String title , int noOfCopies , String author  ) {
		
		super(uniqueIdNo ,title ,noOfCopies);
		this.author = author ;
		
	} 
	
	public int computeSalePrice() {
		return super.getNoOfCopies();
	}

}