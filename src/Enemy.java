
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
		xcord = xcord+1;
	}else if (xcord>playerxcords) {
		xcord = xcord-1;
	}
	return xcord;
	
}
public int findycords(int playerycords) {
	if (ycord < playerycords) {
		ycord = ycord+1;
	}else if (ycord>playerycords) {
		ycord = ycord-1;
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


