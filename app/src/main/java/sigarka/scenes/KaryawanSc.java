package sigarka.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class KaryawanSc {

    public static Scene createScene(Stage stage) {

        StackPane root = new StackPane();
        root.getChildren().add(new Label("Scene Karyawan"));

        return new Scene(root, 500, 400);
    }
}