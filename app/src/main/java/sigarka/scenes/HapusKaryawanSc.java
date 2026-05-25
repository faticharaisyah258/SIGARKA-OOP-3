package sigarka.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HapusKaryawanSc {

    public static Scene createScene(Stage stage) {

        Label title = new Label("Hapus Data Karyawan");

        TextField tfId = new TextField();
        tfId.setPromptText("Input ID Karyawan");

        Label lblStatus = new Label();

        Button btnCek = new Button("Cek ID");

        VBox konfirmasiBox = new VBox(10);

        btnCek.setOnAction(e -> {

            String id = tfId.getText();

            // VALIDASI DATABASE
            boolean valid = false;

            // contoh dummy
            if(id.equals("K001")) {
                valid = true;
            }

            if(!valid) {

                lblStatus.setText("ID tidak valid!");

                konfirmasiBox.getChildren().clear();

            } else {

                lblStatus.setText("Yakin untuk menghapus?");

                Button btnIya = new Button("Iya");
                Button btnTidak = new Button("Tidak");

                konfirmasiBox.getChildren().clear();

                konfirmasiBox.getChildren().addAll(
                        btnIya,
                        btnTidak
                );

                btnIya.setOnAction(ev -> {

                    // hapus dari database

                    lblStatus.setText("Data berhasil dihapus!");

                    konfirmasiBox.getChildren().clear();
                });

                btnTidak.setOnAction(ev -> {

                    tfId.clear();

                    lblStatus.setText("");

                    konfirmasiBox.getChildren().clear();
                });
            }
        });

        Button btnBack = new Button("Kembali");

        btnBack.setOnAction(e ->
                stage.setScene(KaryawanSc.createScene(stage)));

        VBox root = new VBox(15);

        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                title,
                tfId,
                btnCek,
                lblStatus,
                konfirmasiBox,
                btnBack
        );

        return new Scene(root, 500, 450);
    }
}