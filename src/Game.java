import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.Timer;

import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Game {
private int stagelevel = 1;
private Text stagetext = new Text("Level 1");
private boolean game1 = true;
private String playerName;
private int score = 0;
private int highScore;
private Player player = new Player("Steve");;
private Items item;
Items[] itemList;
private Scene thescene;
private Group Maingroup = new Group();
public boolean stage2 = false;
public  List<Items> items = new ArrayList<Items>();
public List<ImageView> itemImage = new ArrayList<ImageView>();
public List<ImageView> itemImage2 = new ArrayList<ImageView>();
private ImageView characterimage;
private static int removeItem;
private Enemy theenemy;
private Movement move;
private ImageView enemyview;
private Collision rectDraw = new Collision();
private double enemyX, enemyY;
private Rectangle enemy, playa = new Rectangle();
private boolean collisionDetected = false;
private Rectangle itemRect = new Rectangle();
private Timer newtimer = new Timer(100, new myTimeHandler());
private Bounds itemRectBounds = null;
private Text myScore = new Text();
private Text gameOver = new Text();
private Text player_score = new Text();

 public void setPlayername(String playername) {
	 player.setplayername(playername);
 }
 public Scene start() {
	 
	 theenemy = new Enemy(600, 200, "Red guy");
	
	 Image enemyimage = new Image(theenemy.getyourimage());
	 enemyview = new ImageView(enemyimage);
	 Maingroup.getChildren().add(enemyview);
	 newtimer.start();
	 try {
		setspeed();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 move = new Movement(getspeed());
	 Maingroup.getChildren().add(stagetext);
	 stagetext.setX(900);
	 stagetext.setY(25);
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
}); //Items
	
	for (int i = 0; i < items.size();i++ ) {
		
		 itemImage.add(new ImageView(items.get(i).getitemimage()));
		 itemImage.get(i).setX(items.get(i).getxLocation());
		 itemImage.get(i).setY(items.get(i).getyLocation());
		 itemImage.get(i).setFitHeight(25);itemImage.get(i).setFitWidth(20);
		 Maingroup.getChildren().add(itemImage.get(i));
		 
	
		}
		//Score
		myScore.setLayoutX(800);myScore.setLayoutY(700);
		Maingroup.getChildren().add(myScore);
		
	//Game Over
		player_score.setLayoutX(400);
		player_score.setLayoutY(250);
		gameOver.setLayoutX(400);gameOver.setLayoutY(300);
		gameOver.setFill(Color.BLACK);gameOver.setStyle("-fx-font: 48 arial;");
		Maingroup.getChildren().add(gameOver);
		Maingroup.getChildren().add(player_score);
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
public void setspeed() throws FileNotFoundException {
	
	 player.setspeed(1);
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

	
	

public class myTimeHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		 enemyX = theenemy.findxcords(player.getxcord());
		 enemyY = theenemy.findycords(player.getycord());
		enemyview.setLayoutX(enemyX);
		enemyview.setLayoutY(enemyY);
		
		 enemy = rectDraw.getBounds(enemyX, enemyY, 50, 82);
		 playa = rectDraw.getBounds(player.getxcord(), player.getycord(), 50, 50);
		 
		 if (enemy.getBoundsInLocal().intersects(playa.getBoundsInLocal())) {
				
			 collisionDetected = true;
			//GameOver
				newtimer.stop();
				gameOver.setText("Game Over");
				player_score.setText(player.getname() +"  :  " + GraphicsDriver.score);
				
				
			
	} 
		for (int i=0 ; i < items.size();i++ ) {
		itemRect = rectDraw.getBounds(items.get(i).getxLocation(), items.get(i).getyLocation(), 25, 20);
		Bounds itemRectBounds = itemRect.getBoundsInLocal();

		 if (itemRectBounds.intersects(playa.getBoundsInLocal())&& game1==true) {
	
			 GraphicsDriver.score += 5;
			 itemImage.get(i).setImage(null);
			 itemImage.remove(i);
			 items.remove(i);
			 myScore.setText("Score: "+ GraphicsDriver.score);
			 
			
			}else if (itemRectBounds.intersects(playa.getBoundsInLocal())&& game1==false) {
				
				 GraphicsDriver.score += 5;
				 itemImage2.get(i).setImage(null);
				 itemImage2.remove(i);
				 items.remove(i);
				 myScore.setText("Score: "+ GraphicsDriver.score);
			}
			}
		
if (items.size() == 0) {
	PauseTransition pauseTransition = new PauseTransition(Duration.seconds(3));
    pauseTransition.play();
    game1 = false;
	 stagelevel +=1;
	 stagetext.setText("Level "+ stagelevel);
	
	for (int i= 0; i < 6; i++) {
		   items.add(new Items());
		   }
	
		 
		 Platform.runLater(() -> {
			 for (int j = 0; j < items.size();j++ ) {
			 itemImage2.add(new ImageView(items.get(j).getitemimage()));
			 itemImage2.get(j).setX(items.get(j).getxLocation());
			 itemImage2.get(j).setY(items.get(j).getyLocation());
			 itemImage2.get(j).setFitHeight(25);itemImage2.get(j).setFitWidth(20);
			 Maingroup.getChildren().add(itemImage2.get(j));}
			});
		 

}
 
	 }
	
}

}