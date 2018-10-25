import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.scene.image.Image;

public class Game {
private String playerName;
private int score;
private int highScore;
private Player player;
private Items item;


public Game() {
		player = new Player( "Steve");
		item = new Items();
		
		

}
public void setplayercords(int xcords, int ycords) {
	player.setXcord(xcords);
	player.setYcord(ycords);
	
}

public void setItemCords(int xcords, int ycords) {
	item.setxLocation(xcords);
	item.setyLocation(ycords);
}

public int getspeed() {
	return player.getspeed();
}
public void setspeed(int buttonpressed) throws FileNotFoundException {
	
	 player.setspeed(buttonpressed);
}
public int getxcords() {
	return player.getxcord();
}
public int getycords() {
	return player.getycord();

}
public int getitemxcords() {
	return item.getxLocation();
}
public int getitemycords() {
	return item.getyLocation();

}

public Image getplayerimage() {
	String imagestr = player.getyourimage();
	Image playerimage = new Image(imagestr);
	return playerimage;
}

public Image getitemimage() {
	String imagestr = item.getitemimage();
	Image itemimage = new Image(imagestr);
	return itemimage;
}
public void collectScores() {
	
}



public String toString() {
	return "";
}
}
