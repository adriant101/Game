import java.util.Random;

public class Items {

	private int xLocation;
	private int yLocation;
	private String imagePath;
	
	
	/* Generate an array of items, which then populates the scene by random index*/
	
	Random rand = new Random();
	//Constructor
	public Items() {
		
		this.xLocation = rand.nextInt(900)+10;
		this.yLocation = rand.nextInt(900)+10;
		this.imagePath = "file:src\\item.png";
	}
	public void setxLocation(int xLocation) {
		this.xLocation = xLocation;
	}
	public void setyLocation(int yLocation) {
		this.yLocation = yLocation;
	}
	public int getxLocation() {
		return xLocation;
	}
	public int getyLocation() {
		return yLocation;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public void setRand(Random rand) {
		this.rand = rand;
	}
	public String getitemimage() {
		return imagePath;
	}
	
	/*public void nextLevelQty() {
		itemQty +=2;
		
	}
	
	public void raiseScore() {
		
	}
	*/
	
}
