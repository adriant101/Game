import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Player {
	int speed;
	
	String playername;
	int xcord;
	int ycord;
	String imgpath;
	private final int STARTINGX = 250, STARTINGY= 250;
public Player( String playername) {
	this.xcord = STARTINGX;
	this.ycord = STARTINGY;
	this.imgpath = "file:src\\Playerimg.jpeg";
	this.playername = playername;
	
}

public int getspeed() {
	return speed;
}

public void setspeed(int buttonpressed) throws FileNotFoundException {
	Scanner myscan;
	if (buttonpressed == 1) {
		File myFile = new File("src\\Chicken.txt");
		myscan = new Scanner(myFile);
		speed = (int) Integer.parseInt(myscan.nextLine());
		
	}else if (buttonpressed == 2) {
		File myFile = new File("src\\Cow.txt");
		myscan = new Scanner(myFile);
		speed = (int) Integer.parseInt(myscan.nextLine());
	}
}
public String getyourimage() {
	return imgpath;
}

//Coordinates that get updated
public int getxcord() {
	return xcord;
}



public void setXcord(int xcord) {
	this.xcord = xcord;
}


public void setYcord(int ycord) {
	this.ycord = ycord;
}

public int getycord() {
	return ycord;
}
}


