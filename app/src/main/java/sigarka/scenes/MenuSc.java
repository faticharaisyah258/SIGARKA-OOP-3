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

        Button btnKaryawan = new Button("Kelola Data Karyawan");
        btnKaryawan.setPrefWidth(200);

        btnKaryawan.setStyle(
                "fx-background-color: #1E4D8F;"+
                "-fx-text-fill: white;" +
                "-fx-font-size: 15px;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 12;" +
                "-fx-padding: 10;"
        );

        Button btnGaji = new Button("Hitung Gaji");
        Button btnSlip = new Button("Data Karyawan & Slip Gaji");
        Button btnLogout = new Button("Logout");

        btnKaryawan.setOnAction(e ->
                stage.setScene(KaryawanSc.createScene(stage)));

        btnGaji.setOnAction(e ->
                stage.setScene(GajiSc.createScene(stage)));

        btnSlip.setOnAction(e ->
                stage.setScene(SlipGajiSc.createScene(stage)));

        btnLogout.setOnAction(e ->
                stage.setScene(LoginSc.createScene(stage)));

        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                title,
                btnKaryawan,
                btnGaji,
                btnSlip,
                btnLogout
        );

        return new Scene(root, 500, 400);
    }
}