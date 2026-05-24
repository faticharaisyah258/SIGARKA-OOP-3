package sigarka.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SlipGajiSc {

    public static Scene createScene(Stage stage) {

        StackPane root = new StackPane();
        root.getChildren().add(new Label("Scene Slip Gaji"));

        return new Scene(root, 500, 400);
    }
}