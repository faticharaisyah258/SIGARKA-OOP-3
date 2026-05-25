package sigarka.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MenuSc {

    public static Scene createScene(Stage stage) {

        // ===== TITLE =====
        Image logo = new Image(
                LoginSc.class.getResourceAsStream("/images/logo_menu.png")
        );
        ImageView logoView = new ImageView(logo);
        logoView.setFitWidth(100);
        logoView.setPreserveRatio(true);

        Label title = new Label("MENU UTAMA");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 28));
        title.setTextFill(Color.web("#1E4D8F"));

        

        // ===== BUTTON STYLE =====
        String buttonStyle =
                "-fx-background-color: #1E4D8F;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 15px;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 12;" +
                "-fx-padding: 12;" +
                "-fx-cursor: hand;";

        String hoverStyle =
                "-fx-background-color: #4FA89A;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 15px;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 12;" +
                "-fx-padding: 12;" +
                "-fx-cursor: hand;";

        // ===== BUTTON =====
        Button btnKaryawan = new Button("Kelola Data Karyawan");
        Button btnGaji = new Button("Hitung Gaji");
        Button btnSlip = new Button("Data Karyawan & Slip Gaji");
        Button btnLogout = new Button("Logout");

        // Ukuran tombol
        btnKaryawan.setPrefWidth(280);
        btnGaji.setPrefWidth(280);
        btnSlip.setPrefWidth(280);
        btnLogout.setPrefWidth(280);

        // Style tombol
        btnKaryawan.setStyle(buttonStyle);
        btnGaji.setStyle(buttonStyle);
        btnSlip.setStyle(buttonStyle);

        // Tombol logout beda warna
        btnLogout.setStyle(
                "-fx-background-color: #d63031;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 15px;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 12;" +
                "-fx-padding: 12;" +
                "-fx-cursor: hand;"
        );

        // Hover effect
        Button[] buttons = {btnKaryawan, btnGaji, btnSlip};

        for (Button btn : buttons) {

            btn.setOnMouseEntered(e ->
                    btn.setStyle(hoverStyle)
            );

            btn.setOnMouseExited(e ->
                    btn.setStyle(buttonStyle)
            );
        }

        btnLogout.setOnMouseEntered(e ->
                btnLogout.setStyle(
                        "-fx-background-color: #ff7675;" +
                        "-fx-text-fill: white;" +
                        "-fx-font-size: 15px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 12;" +
                        "-fx-padding: 12;" +
                        "-fx-cursor: hand;"
                )
        );

        btnLogout.setOnMouseExited(e ->
                btnLogout.setStyle(
                        "-fx-background-color: #d63031;" +
                        "-fx-text-fill: white;" +
                        "-fx-font-size: 15px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 12;" +
                        "-fx-padding: 12;" +
                        "-fx-cursor: hand;"
                )
        );

        // ===== ACTION =====
        btnKaryawan.setOnAction(e ->
                stage.setScene(KaryawanSc.createScene(stage)));

        btnGaji.setOnAction(e ->
                stage.setScene(GajiSc.createScene(stage)));

        btnSlip.setOnAction(e ->
                stage.setScene(SlipGajiSc.createScene(stage)));

        btnLogout.setOnAction(e ->
                stage.setScene(LoginSc.createScene(stage)));

        // ===== CARD =====
        VBox card = new VBox(18);
        card.setAlignment(Pos.CENTER);
        card.setPadding(new Insets(35));
        card.setMaxWidth(450);

        card.setStyle(
                "-fx-background-color: white;" +
                "-fx-background-radius: 25;" +
                "-fx-border-radius: 25;" +
                "-fx-border-color: #D9D9D9;" +
                "-fx-border-width: 1;" +
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.15), 15,0,0,5);"
        );

        card.getChildren().addAll(
                logoView,
                title,
                btnKaryawan,
                btnGaji,
                btnSlip,
                btnLogout
        );

        // ===== ROOT =====
        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER);

        root.setStyle("-fx-background-color: white;");

        root.getChildren().add(card);

        return new Scene(root, 900, 600);
    }
}