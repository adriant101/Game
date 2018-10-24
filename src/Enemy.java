
public class Enemy {
	String enemyname;
	int xcord;
	int ycord;
	int speed;
	String imgpath;
public Enemy(int xcord, int ycord, String imgpath, String enemyname) {
	this.xcord = xcord;
	this.ycord = ycord;
	this.imgpath = imgpath;
	this.enemyname = enemyname;
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


