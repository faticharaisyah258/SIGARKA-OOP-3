package sigarka.dao;

import java.util.ArrayList;

import sigarka.models.Karyawan;

public class Karyawand {

    private static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

    public static void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public static ArrayList<Karyawan> getDaftarKaryawan() {
        return daftarKaryawan;
    }
}