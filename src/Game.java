import javafx.scene.image.Image;

public class Game {
private Player player;
private Enemy enemy;
private Items item;
private int score;
private int highScore;
Movement move1 = new Movement();
public Game() {
	player = new Player("file:src\\Playerimg.jpeg" , "Steve");
	
}
public int getxcords() {
	return player.getxcord();
}
public int getycords() {
	return player.getycord();
}
public Image getplayerimage() {
	String imagestr = player.getyourimage();
	Image playerimage = new Image(imagestr);
	return playerimage;
	 
}
public void collectScores() {
	
}



public String toString() {
	return "";
}
}
