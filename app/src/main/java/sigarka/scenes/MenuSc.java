package sigarka.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuSc {

    public static Scene createScene(Stage stage) {

        Label title = new Label("MENU UTAMA");

        Button btnKaryawan = new Button("Data Karyawan");
        Button btnGaji = new Button("Data Gaji");
        Button btnSlip = new Button("Slip Gaji");

        btnKaryawan.setOnAction(e ->
                stage.setScene(KaryawanSc.createScene(stage)));

        btnGaji.setOnAction(e ->
                stage.setScene(GajiSc.createScene(stage)));

        btnSlip.setOnAction(e ->
                stage.setScene(SlipGajiSc.createScene(stage)));

        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                title,
                btnKaryawan,
                btnGaji,
                btnSlip
        );

        return new Scene(root, 500, 400);
    }
}