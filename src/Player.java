
public class Player {
	String playername;
	int xcord;
	int ycord;
	String imgpath;
public Player(int xcord, int ycord, String imgpath, String playername) {
	this.xcord = xcord;
	this.ycord = ycord;
	this.imgpath = imgpath;
	this.playername = playername;
}

public String getyourimage() {
	return imgpath;
}

public int getxcord() {
	return xcord;
}

public int getycord() {
	return ycord;
}
}


