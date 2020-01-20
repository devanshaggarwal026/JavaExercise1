
public abstract class MediaItem extends Item {
	private int runtime;
	
	public MediaItem(int uniqueIdNo , String title , int noOfCopies , int runtime) {
		super(uniqueIdNo ,title ,noOfCopies);
		this.runtime = runtime ;
	}
	public abstract void random();
	
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	
	
}
