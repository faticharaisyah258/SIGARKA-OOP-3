package sigarka.models;

public abstract class Karyawan {
    private String id;
    private String nama;
    private String tipe;
    private String divisi;
    private String jabatan;

    public Karyawan(String id, String nama, String tipe, String divisi, String jabatan) {
        this.id = id;
        this.nama = nama;
        this.tipe = tipe;
        this.divisi = divisi;
        this.jabatan = jabatan;
    }

    public abstract double hitungGaji(); 

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getTipe() {
        return tipe;
    }

    public String getDivisi() {
        return divisi;
    }

    public String getJabatan() {
        return jabatan;
    }

}
