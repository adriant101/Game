import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class GraphicsDriver extends Application {
	Game game1;
	Movement move;
	ImageView characterimage; 
	Scene Mainscene;
	Group Maingroup;
	ImageView itemImage;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		game1 =new Game();
		Maingroup = new Group();
		Mainscene = new Scene(Maingroup, 1024, 765);
		Button start1 = new Button("Start as chicken");
		Button start2 = new Button("Start as cow");
		start1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				
				for (int i = 0; i < game1.items.size();i++ ) {
					
					itemImage = new ImageView (game1.items.get(i).getitemimage());
					itemImage.setX(game1.items.get(i).getxLocation());
					itemImage.setY(game1.items.get(i).getyLocation());
					itemImage.setFitHeight(25);itemImage.setFitWidth(20);
					Maingroup.getChildren().add(itemImage);
				}
					
					
				
				characterimage = new ImageView (game1.getplayerimage());
				characterimage.setX(game1.getxcords());
				characterimage.setY(game1.getycords());
				Maingroup.getChildren().add(characterimage);
				
				
				try {
					game1.setspeed(1);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int chickenspeed = game1.getspeed();
				move = new Movement(chickenspeed);
				primaryStage.setScene(Mainscene);
			}
			
		});
	
		start1.setLayoutX(200);
		start1.setLayoutY(200);
		
		Group startgroup = new Group(start1);
		Scene startscene = new Scene(startgroup, 1024, 765);
		Mainscene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
			int xcords = game1.getxcords();
			int ycords = game1.getycords();
			if(key.getCode()==KeyCode.W) {
			       int x = move.moveup(ycords);
			       game1.setplayercords(game1.getxcords(), x);
			       characterimage.setX(game1.getxcords());
				 characterimage.setY(game1.getycords());
			    }else if(key.getCode()== KeyCode.A) {
			    	int y = move.moveleft(xcords);
				       game1.setplayercords(y, game1.getycords());
				       characterimage.setX(game1.getxcords());
				       characterimage.setY(game1.getycords());
			    	 
			    }else if(key.getCode()==KeyCode.D) {
			    	int z = move.moveright(xcords);
			    	 game1.setplayercords(z, game1.getycords());
				     characterimage.setX(game1.getxcords());
				     characterimage.setY(game1.getycords());
			    } else if (key.getCode()==KeyCode.S) {
			    	int c = move.movedown(ycords);
			    	  game1.setplayercords(game1.getxcords(), c);
				       characterimage.setX(game1.getxcords());
				       characterimage.setY(game1.getycords());
			    }
		
		      
		});
		
		primaryStage.setScene(startscene);
        primaryStage.setTitle("Lab 7");
        primaryStage.show();
	}

}
