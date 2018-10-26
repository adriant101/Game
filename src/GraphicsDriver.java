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
	Stage primaryStage;
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
		this.primaryStage = primaryStage;
		
		game1 = new Game(Mainscene);
		

		Button start1 = new Button("Start as chicken");
		Button start2 = new Button("Start as cow");
		start1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				
				
					
					
				

				
				
				/*try {
					game1.setspeed(1);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int chickenspeed = game1.getspeed();
				move = new Movement(chickenspeed);*/
				
				primaryStage.setScene(game1.start());
			}
			
		});
	
		start1.setLayoutX(200);
		start1.setLayoutY(200);
		
		Group startgroup = new Group(start1);
		Scene startscene = new Scene(startgroup, 1024, 765);
		
		
		primaryStage.setScene(startscene);
        primaryStage.setTitle("Lab 7");
        primaryStage.show();
	}

}
