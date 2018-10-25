import javafx.scene.input.KeyCode;

public class Movement {
int Speed;
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
	
	//WASD 
	public void WASD(String userKey) {
		if (userKey.equalsIgnoreCase("w"))
				{
			moveup(10);
				}
		else if(userKey.equalsIgnoreCase("a")) {
			moveleft(10);
		}
		else if (userKey.equalsIgnoreCase("s")) {
			movedown(10);
			
		}
		else if (userKey.equalsIgnoreCase("d")) {
			moveright(10);
		}
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