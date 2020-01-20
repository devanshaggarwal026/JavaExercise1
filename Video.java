
public class Video extends MediaItem {
	
	private String director , genre ;
	private int year;
	
	private Video(int uniqueIdNo , String title , int noOfCopies , int runtime , String director , String genre ,  int Year) {
		super(uniqueIdNo , title , noOfCopies , runtime);
		this.director = director;
		this.genre = genre;
		this.year = year;	
	}
	
	public int computeSalePrice() {
		return super.getNoOfCopies();
	}
	
	public void random() {
		System.out.println("jgd");
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
