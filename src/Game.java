import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.scene.image.Image;

public class Game {
private String playerName;
private int score;
private int highScore;
private Player player;
private Items item;
Items[] itemList;
public static List<Items> items = new ArrayList<Items>();




public Game() {
		player = new Player("Steve");
		
		for (int i= 0; i < 5; i++) {
		   items.add(new Items());
		   }
		

}

public void setplayercords(int xcords, int ycords) {
	player.setXcord(xcords);
	player.setYcord(ycords);
	
}

public void setItemCords(int xcords, int ycords) {
	for (Items i:items) {
		i.setxLocation(xcords);
		i.setyLocation(ycords);
	}
	
	
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
	
	int x=0;
	for(Items i : items) {
		
	 x =  i.getxLocation();
	 
	
	}
	return x;
	
}
public int getitemycords() {
	int y=0;
	for(Items i : items) {
		
	 y =  i.getxLocation();
	 
	
	}
	return y;

}

public Image getplayerimage() {
	String imagestr = player.getyourimage();
	Image playerimage = new Image(imagestr);
	return playerimage;
}

public Image getitemimage() {
	Image img = null;
	for(Items i : items) {
		String imagestr = i.getitemimage();
		Image itemimage = new Image(imagestr);
				img = itemimage;
	}
	
	return img;
}
public void collectScores() {
	
}



public String toString() {
	return "";
}
}
