import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class WorldDraw extends Application {

    // Variables to control animation
    private double xPosition = 50;
    private double rectangleWidth = 100;

    @Override
    public void start(Stage primaryStage) {
        // Create a Group to hold the Canvas
        Group root = new Group();
        // Create a Canvas with a specific width and height
        Canvas canvas = new Canvas(500, 500);
        // Get the GraphicsContext to draw on the canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        // Load the image
        Image image = new Image("file:image.png"); // Use your image path here

        // Set up the Timeline for animation
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.millis(16), e -> {
                
                this.xPosition++;
                
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                
                // Draw the rectangle with updated values
                gc.setFill(Color.BLUE);
                gc.fillRect(xPosition, 50, rectangleWidth, 100); // Use the updated xPosition and rectangleWidth
                
                // Draw the image at a specific position (xPosition, 200) on the canvas
                gc.drawImage(image, xPosition, 200); // Adjust as needed
            })
        );
        
        // Set the timeline to loop indefinitely
        timeline.setCycleCount(Timeline.INDEFINITE);
        
        // Start the animation
        timeline.play();
        
        // Add the canvas to the root node
        root.getChildren().add(canvas);
        
        // Set up the scene and stage
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Animated JavaFX Drawing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
