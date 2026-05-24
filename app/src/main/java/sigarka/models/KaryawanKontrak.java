package sigarka.models;

public class KaryawanKontrak extends Karyawan {
    private int jamKerja;

    public KaryawanKontrak(String nama, String id, String divisi, String jabatan, int jamKerja) {
        super(nama, id);    
        this.jamKerja = jamKerja;
    }

    @Override
    public double hitungGaji() {
        double gajiPerJam = 30000;

        return jamKerja * gajiPerJam; 
    }
}