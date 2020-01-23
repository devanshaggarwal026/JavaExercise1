

public class CD extends MediaItem{
	
	private String artist , genre ;
	
	public CD(int uniqueIdNo , String title , int noOfCopies , int runtime , String artist , String genre) {
		super(uniqueIdNo , title , noOfCopies , runtime);
		this.genre = genre;
		this.artist = artist;
	}
	
	
	
	public int computeSalePrice() {
		return super.getNoOfCopies();
	}
	
	
	public void random() {
		//return super.getRuntime();
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
