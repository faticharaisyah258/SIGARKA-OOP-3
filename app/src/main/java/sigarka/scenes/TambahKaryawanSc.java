package sigarka.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TambahKaryawanSc {

    public static Scene createScene(Stage stage) {

        Label title = new Label("Kelola Data Karyawan");

        TextField tfId = new TextField();
        tfId.setPromptText("Input ID Karyawan");

        TextField tfNama = new TextField();
        tfNama.setPromptText("Input Nama Karyawan");

        Label lblTipe = new Label("Pilih Tipe Karyawan");

        Button btnTetap = new Button("Tetap");
        Button btnKontrak = new Button("Kontrak");

        VBox tambahanTetap = new VBox(10);

        Label lblStatus = new Label();

        // KONTRAK
        btnKontrak.setOnAction(e -> {

            String id = tfId.getText();
            String nama = tfNama.getText();

            // simpan database
            // tipe = kontrak

            lblStatus.setText("Data karyawan kontrak berhasil disimpan!");
        });

        // TETAP
        btnTetap.setOnAction(e -> {

            TextField tfDivisi = new TextField();
            tfDivisi.setPromptText("Input Divisi");

            TextField tfJabatan = new TextField();
            tfJabatan.setPromptText("Input Jabatan");

            Button btnSimpan = new Button("Simpan");

            tambahanTetap.getChildren().clear();

            tambahanTetap.getChildren().addAll(
                    tfDivisi,
                    tfJabatan,
                    btnSimpan
            );

            btnSimpan.setOnAction(ev -> {

                String id = tfId.getText();
                String nama = tfNama.getText();

                String divisi = tfDivisi.getText();
                String jabatan = tfJabatan.getText();

                // hitung gaji
                double gaji = 5000000;

                // simpan database

                lblStatus.setText("Data karyawan tetap berhasil disimpan!");
            });
        });

        Button btnBack = new Button("Kembali");

        btnBack.setOnAction(e ->
                stage.setScene(KaryawanSc.createScene(stage)));

        VBox root = new VBox(15);

        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                title,
                tfId,
                tfNama,
                lblTipe,
                btnTetap,
                btnKontrak,
                tambahanTetap,
                lblStatus,
                btnBack
        );

        return new Scene(root, 500, 600);
    }
}