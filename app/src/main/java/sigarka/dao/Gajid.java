package sigarka.dao;

import java.util.ArrayList;

import sigarka.models.Gaji;

public class Gajid {

    private static ArrayList<Gaji> daftarGaji = new ArrayList<>();

    public static void tambahGaji(Gaji gaji) {
        daftarGaji.add(gaji);
    }

    public static ArrayList<Gaji> getDaftarGaji() {
        return daftarGaji;
    }
}