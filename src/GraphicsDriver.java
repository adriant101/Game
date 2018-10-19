import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GraphicsDriver extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		boolean alive =false;
		Group Maingroup = new Group();
		Scene Mainscene = new Scene(Maingroup, 500, 500);
		
		Button start = new Button("Press here to start");
		start.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				primaryStage.setScene(Mainscene);
				
			}
		});
		
		
		start.setLayoutX(200);
		start.setLayoutY(200);
		
		Group startgroup = new Group(start);
		Scene startscene = new Scene(startgroup, 500, 500);
		
		primaryStage.setScene(startscene);
        primaryStage.setTitle("Lab 7");
        primaryStage.show();
	}

}
