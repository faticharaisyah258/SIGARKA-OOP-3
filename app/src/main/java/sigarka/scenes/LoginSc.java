package sigarka.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginSc {

    public static Scene createScene(Stage stage) {

        Label title = new Label("LOGIN SIGARKA");

        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginBtn = new Button("Login");

        Label info = new Label();

        loginBtn.setOnAction(e -> {

            String username = usernameField.getText();
            String password = passwordField.getText();

            if (username.equals("admin") && password.equals("123")) {
                stage.setScene(MenuSc.createScene(stage));
            } else {
                info.setText("Username / Password salah!");
            }
        });

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(
                title,
                usernameField,
                passwordField,
                loginBtn,
                info
        );

        return new Scene(root, 400, 300);
    }
}