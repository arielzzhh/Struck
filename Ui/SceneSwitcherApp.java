package Ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SceneSwitcherApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        //intilitze the layout
        VBox layout1 = new VBox(20);
        Button switchButton1 = new Button("Switch to Scene 2");
        Text text1 = new Text("This is humanoid");
        Button startButton = new Button("Start Game");
        Button editorButton = new Button("editor");
        Button LoadButton = new Button("load Game");
        layout1.getChildren().addAll(switchButton1,text1,startButton,editorButton,LoadButton);
        Scene scene1 = new Scene(layout1, 300, 250);

        
      

        

        // Set the initial scene
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
