
public class Enemy {
	String enemyname;
	int xcord;
	int ycord;
	int speed;
	String imgpath;
public Enemy(int xcord, int ycord, String enemyname) {
	this.xcord = xcord;
	this.ycord = ycord;
	this.imgpath = "file:src\\The_Red_Guy.jpg";
	this.enemyname = enemyname;
}



public int findxcords(int playerxcords) {
	if (xcord < playerxcords) {
		xcord = xcord+3;
	}else if (xcord>playerxcords) {
		xcord = xcord-3;
	}
	return xcord;
	
}
public int findycords(int playerycords) {
	if (ycord < playerycords) {
		ycord = ycord+8;
	}else if (ycord>playerycords) {
		ycord = ycord-8;
	}
	return ycord;
	
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


