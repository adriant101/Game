import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class Game {
private String playerName;
private int score;
private int highScore;
private Player player =new Player("Steve");;
private Items item;
Items[] itemList;
private Scene thescene;
private Group Maingroup = new Group();
public static List<Items> items = new ArrayList<Items>();
private ImageView characterimage;
private Movement move = new Movement(15);
private ImageView itemImage;

 public Scene start() {
	 thescene = new Scene(Maingroup, 1024, 765);
    characterimage = new ImageView (getplayerimage());
    characterimage.setX(getxcords());
    characterimage.setY(getycords());
    Maingroup.getChildren().add(characterimage);
	thescene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
		int xcords = getxcords();
		int ycords = getycords();
		if(key.getCode()==KeyCode.W) {
	       int x = move.moveup(ycords);
	       setplayercords(getxcords(), x);
		       characterimage.setX(getxcords());
			 characterimage.setY(getycords());
		    }else if(key.getCode()== KeyCode.A) {
		    	int y = move.moveleft(xcords);
			       setplayercords(y, getycords());
			       characterimage.setX(getxcords());
			       characterimage.setY(getycords());
		    	 
		    }else if(key.getCode()==KeyCode.D) {
		    	int z = move.moveright(xcords);
		    	 setplayercords(z, getycords());
			     characterimage.setX(getxcords());
			     characterimage.setY(getycords());
		    } else if (key.getCode()==KeyCode.S) {
		    	int c = move.movedown(ycords);
		    	   setplayercords(getxcords(), c);
			       characterimage.setX(getxcords());
			       characterimage.setY(getycords());
		    }
});
	for (int i = 0; i < items.size();i++ ) {
		
		itemImage = new ImageView (items.get(i).getitemimage());
		itemImage.setX(items.get(i).getxLocation());
		itemImage.setY(items.get(i).getyLocation());
		itemImage.setFitHeight(25);itemImage.setFitWidth(20);
		Maingroup.getChildren().add(itemImage);}
	return thescene;
	}



public Game(Scene thescene) {
		this.thescene = thescene;
		
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
