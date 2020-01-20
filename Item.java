
public abstract class Item {
	private int uniqueIdNo;
	private String title;
	private static int noOfCopies;
	
	//constructor
	
	
	
	public Item(int uniqueIdNo , String title , int noOfCopies) {
		this.uniqueIdNo = uniqueIdNo;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	
	public abstract int computeSalePrice();
	
	//getter for uniqueId
	public int getUniqueIdNo() {
		return uniqueIdNo  ; 
	}
	
	public String getTitle() {
		return title  ; 
	}
	
	public int getNoOfCopies() {
		return noOfCopies  ; 
	}
	
	//setter
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	//equals
	public void equals() {
		System.out.println("Equals method called");
	}
	
	//toString
	public void tostring() {
		System.out.println("toString method called");
	}
	
	public void print() {
		System.out.println("unique id no is " + uniqueIdNo + "/n" + "title is " + title + "/n" + "no of copies are " + noOfCopies );
	}
	
	public void checkIn(int copiesIssued) {
		noOfCopies -= copiesIssued;
		System.out.println("no of copies available are " + noOfCopies);
	}
	
	public void checkOut(int copiesReturned) {
		noOfCopies += copiesReturned;
		System.out.println("no of copies available are " + noOfCopies);
	}
	
	public void addItem() {
		
	}
	
	

}
