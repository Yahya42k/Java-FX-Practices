package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/*
public class Main extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		// TODO Auto-generated method stub
		//Stage stage=new Stage()
		
		//Group- 
		Group root=new Group();
		Scene scene=new Scene(root,Color.BLACK);
		Image icon= new Image("icon.jpg");
		
		stage.getIcons().add(icon);
		stage.setWidth(420);
		stage.setHeight(420);
	    stage.setResizable(false);
	    //stage.setX(50);
	   // stage.setY(50);
	    stage.setFullScreen(true);
		stage.setFullScreenExitHint("you can escape untill you hit q");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
	    
		stage.setScene(scene);
	    stage.setTitle("First program");
	    
		stage.show();		
	}
}
*/

public class Main extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// TODO Auto-generated method stub
		//Stage stage=new Stage()
		
		//Group- 
		Group root=new Group();
		Scene scene=new Scene(root,900,800,Color.LIGHTSKYBLUE);
		Stage stage =new Stage();
		
		Text text=new Text();
		text.setText("WOOW");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("verdana",50));
		text.setFill(Color.LIMEGREEN);
		
		Line line=new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(200);
		line.setFill(Color.AZURE);
		line.setStrokeWidth(5);
		line.setStroke(Color.RED);
		line.setOpacity(0.5);
		line.setRotate(45);
		
		Rectangle rectangle=new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.AQUAMARINE);
		rectangle.setStrokeWidth(5);
		rectangle.setStroke(Color.PINK);
		
		Polygon triangle=new Polygon();
		triangle.getPoints().setAll(200.0,200.0,300.0,300.0,200.0,300.0);
		triangle.setFill(Color.YELLOW);
		
		Circle circle=new Circle();
		circle.setCenterX(350);
		circle.setCenterY(350);
		circle.setRadius(50);
		circle.setFill(Color.ORANGE);
		
		Image image=new Image("icon.jpg");
		ImageView imageView=new ImageView(image);
		imageView.setX(400);
		imageView.setY(400);
		
		
		root.getChildren().add(imageView);
		root.getChildren().add(circle);
		root.getChildren().add(triangle);
		root.getChildren().add(rectangle);
		root.getChildren().add(line);
		root.getChildren().add(text);
	    stage.setScene(scene);
		stage.show();		
	}
}
