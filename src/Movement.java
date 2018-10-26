import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Movement {
private int Speed;

public Movement (int Speed) {
	this.Speed = Speed;
}
	public int moveup(int ycord) {
		ycord = ycord - Speed ;
		return ycord;
	}

	public int movedown(int ycord) {
		ycord = ycord+Speed;
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