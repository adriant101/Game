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
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		move = new Movement();
		game1 =new Game();
		Maingroup = new Group();
		Mainscene = new Scene(Maingroup, 1024, 765);
		Button start = new Button("Press here to start");
		start.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
			
				
				characterimage = new ImageView (game1.getplayerimage());
				characterimage.setX(game1.getxcords());
				characterimage.setY(game1.getycords());
				Maingroup.getChildren().add(characterimage);
				primaryStage.setScene(Mainscene);
			}
			
		});
	
		start.setLayoutX(200);
		start.setLayoutY(200);
		
		Group startgroup = new Group(start);
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
			    	int y = move.moveup(xcords);
				       game1.setplayercords(y, game1.getxcords());
			    	 
			    }else if(key.getCode()==KeyCode.D) {
			    	 move.moveright(xcords);
			    } else if (key.getCode()==KeyCode.S) {
			    	 move.movedown(xcords);
			    }
		
		      
		});
		
		primaryStage.setScene(startscene);
        primaryStage.setTitle("Lab 7");
        primaryStage.show();
	}

}
