import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;

public class Movement {
private int Speed;
private int x;
private int y;
private int width;
private int height;


public Movement (int Speed) {
	this.Speed = Speed;
}
public Movement (int x, int y, int width, int height) {
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	
}


//drawing rectangle
public Rectangle getBounds() {
	return new Rectangle(x, y, width, height);
}


	public int moveup(int ycord) {
		ycord = ycord - Speed ;
		return ycord;
	}

	public int movedown(int ycord) {
		ycord = ycord+ Speed;
		return ycord;
	}

	public int moveleft(int xcord) {
		xcord = xcord - Speed;
		return xcord;
	}

	public int moveright(int xcord) {
		xcord = xcord + Speed;
		return xcord;
    }

	
	
	
	
//	public boolean enemycollisiondetection(int enemyxcord, int enemyycord, int playerxcord, int playerycord) {
//		if (enemyxcord == playerxcord && enemyycord == playerycord) {
//			return true;
//		}else
//			return false;
//	}
//	public boolean itemcollisiondetection(int itemxcord, int itemycord, int playerxcord, int playerycord) {
//		if (itemxcord == playerxcord && itemycord == playerycord) {
//			return true;
//		}else
//			return false;
//	}
}