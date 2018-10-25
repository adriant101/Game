
public class Player {
	String playername;
	int xcord;
	int ycord;
	String imgpath;
	private final int STARTINGX = 250, STARTINGY= 250;
public Player( String imgpath, String playername) {
	this.xcord = STARTINGX;
	this.ycord = STARTINGY;
	this.imgpath = imgpath;
	this.playername = playername;
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


