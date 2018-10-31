import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.Timer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GraphicsDriver extends Application {
	int x=0;
	public static int score;
	Stage primaryStage;
	Game game1;
	Game game2;
	Movement move;
	ImageView characterimage; 
	Scene Mainscene;
	Group Maingroup;
	ImageView itemImage;
	Timer timer1;
	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		timer1 = new Timer(100, new myTimeHandler());
		this.primaryStage = primaryStage;
		timer1.start();
		game1 = new Game(Mainscene);
		
		TextField playername = new TextField("Enter player name");
		Button start1 = new Button("Start as chicken");

		start1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {	
				game1.setPlayername(playername.getText());
				primaryStage.setScene(game1.start());
			}
			
		});
		start1.setLayoutX(200);
		start1.setLayoutY(200);
		
		Group startgroup = new Group(start1, playername);
		Scene startscene = new Scene(startgroup, 1024, 765);
		
		
		primaryStage.setScene(startscene);
        primaryStage.setTitle("Lab 7");
        Scene newscene = null;
        game2 = new Game(newscene);
        
		
        primaryStage.show();
        
   
        
       
	}
	public class myTimeHandler implements ActionListener {

		@Override
		public void actionPerformed(java.awt.event.ActionEvent arg0) {
			
			if (score ==25) {
				
				x=1;
			
			}
		}
		
	}}

