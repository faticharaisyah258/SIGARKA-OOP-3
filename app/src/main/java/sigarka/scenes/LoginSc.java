package sigarka.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginSc {

    public static Scene createScene(Stage stage) {

        // ===== LOGO =====
        Image logo = new Image(
                LoginSc.class.getResourceAsStream("/images/logo.jpeg")
        );

        ImageView logoView = new ImageView(logo);
        logoView.setFitWidth(220);
        logoView.setPreserveRatio(true);

        // ===== USERNAME =====
        TextField usernameField = new TextField();
        usernameField.setPromptText("Masukkan Username");
        usernameField.setMaxWidth(280);

        usernameField.setStyle(
                "-fx-background-radius: 12;" +
                "-fx-border-radius: 12;" +
                "-fx-border-color: #4FA89A;" +
                "-fx-padding: 10;" +
                "-fx-font-size: 14px;"
        );

        // ===== PASSWORD =====
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Masukkan Password");
        passwordField.setMaxWidth(280);

        passwordField.setStyle(
                "-fx-background-radius: 12;" +
                "-fx-border-radius: 12;" +
                "-fx-border-color: #4FA89A;" +
                "-fx-padding: 10;" +
                "-fx-font-size: 14px;"
        );

        // ===== BUTTON LOGIN =====
        Button loginBtn = new Button("LOGIN");
        loginBtn.setPrefWidth(280);

        loginBtn.setStyle(
                "-fx-background-color: #1E4D8F;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 15px;" +
                "-fx-font-weight: bold;" +
                "-fx-background-radius: 12;" +
                "-fx-padding: 10;"
        );

        // Hover button
        loginBtn.setOnMouseEntered(e ->
                loginBtn.setStyle(
                        "-fx-background-color: #4FA89A;" +
                        "-fx-text-fill: white;" +
                        "-fx-font-size: 15px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 12;" +
                        "-fx-padding: 10;"
                )
        );

        loginBtn.setOnMouseExited(e ->
                loginBtn.setStyle(
                        "-fx-background-color: #1E4D8F;" +
                        "-fx-text-fill: white;" +
                        "-fx-font-size: 15px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 12;" +
                        "-fx-padding: 10;"
                )
        );

        // ===== INFO =====
        Label info = new Label();
        info.setFont(Font.font("Arial", 13));

        // ===== LOGIN ACTION =====
        loginBtn.setOnAction(e -> {

            String username = usernameField.getText();
            String password = passwordField.getText();

            String validUsername = "admin";
            String validPassword = "123";

            // Login berhasil
            if (username.equals(validUsername) &&
                    password.equals(validPassword)) {

                stage.setScene(MenuSc.createScene(stage));
            }

            // Username atau Password salah
            else if (!username.equals(validUsername) ||
                    !password.equals(validPassword)) {

                info.setTextFill(Color.RED);
                info.setText("Username atau Password tidak valid!");
            }
        });

        // ===== CARD =====
        VBox card = new VBox(15);
        card.setAlignment(Pos.CENTER);
        card.setPadding(new Insets(35));
        card.setMaxWidth(420);

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
                usernameField,
                passwordField,
                loginBtn,
                info
        );

        // ===== ROOT =====
        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER);

        // Background
        root.setStyle("-fx-background-color: white;");

        root.getChildren().add(card);

        return new Scene(root, 900, 600);
    }
}