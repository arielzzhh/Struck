package Ui;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CustomView extends VBox {
    public CustomView(String message) {
        // Create a label with the provided message
        Label label = new Label(message);
        label.setStyle("-fx-font-size: 16px; -fx-text-fill: blue;");

        // Add the label to this custom view
        this.getChildren().add(label);
        this.setStyle("-fx-padding: 20; -fx-alignment: center;");
    }
}
