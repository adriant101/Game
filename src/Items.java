import java.util.Random;

public class Items {

	private int xLocation;
	private int yLocation;
	private String imagePath;
	private int itemQty;
	
	/* Generate an array of items, which then populates the scene by random index*/
	
	Random rand = new Random();
	//Constructor
	public Items(int xLocation, int yLocation, String imagePath, int itemQty) {
		
		this.xLocation = rand.nextInt(900)+10;
		this.yLocation = rand.nextInt(900)+10;
		this.imagePath = imagePath;
	}
	
	/*public void nextLevelQty() {
		itemQty +=2;
		
	}
	
	public void raiseScore() {
		
	}
	*/
	
}
