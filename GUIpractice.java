//This is just for practice
package github;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Interface extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) {
		primaryStage.setTitle("COMP 2200");
		primaryStage.show();
		Label label1 = new Label("Number one");
		Label label2 = new Label("Number two");
		Label label3 = new Label("Number three");
		TextField txt1 = new TextField();
		TextField txt2 = new TextField();
		TextField txt3 = new TextField();
		Button btn1 = new Button("Nothing will hapen");
		Button btn2 = new Button("Nothing will hapen");
		Button btn3 = new Button("Nothing will hapen");
		VBox myVbox = new VBox(10, label1, txt1, btn1, label2, txt2, btn2, label3, txt3, btn3);
		Scene myScene = new Scene(myVbox);
		primaryStage.setScene(myScene);
		
	}

}
