package sigarka.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KaryawanSc {

    public static Scene createScene(Stage stage) {

        Label title = new Label("Kelola Data Karyawan");

        Button btnTambah = new Button("Tambah");
        Button btnHapus = new Button("Hapus");
        Button btnBack = new Button("Kembali");

        btnTambah.setOnAction(e ->
                stage.setScene(TambahKaryawanSc.createScene(stage)));

        btnHapus.setOnAction(e ->
                stage.setScene(HapusKaryawanSc.createScene(stage)));

        btnBack.setOnAction(e ->
                stage.setScene(MenuSc.createScene(stage)));

        VBox root = new VBox(15);

        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                title,
                btnTambah,
                btnHapus,
                btnBack
        );

        return new Scene(root, 500, 400);
    }
}