package sigarka.models;

public class KaryawanTetap extends Karyawan {
    private String divisi;
    private String jabatan;
    private int alpa;
    private int izin;
    private int lembur;

    public KaryawanTetap(String nama, String id, String divisi, String jabatan, int alpa, int izin, int lembur) {
        super(nama, id);
        this.divisi = divisi;
        this.jabatan = jabatan;
        this.alpa = alpa;
        this.izin = izin;
        this.lembur = lembur;
    }

    public String getDivisi() {
        return divisi;
    }

    public String getJabatan() {
        return jabatan;
    }

    @Override
    public double hitungGaji() {
        double gajiPokok = 0;

        if (getDivisi().equals("Bisnis Global dan Pemasaran")){

            if (getJabatan().equals("Manager")){
                gajiPokok = 7000000;
            } else {
                gajiPokok = 6000000;
            }
        }

        if (getDivisi().equals("Produksi Kreatif")){

            if (getJabatan().equals("Manager")){
                gajiPokok = 6500000;
            } else {
                gajiPokok = 5500000;
            }
        }

        if (getDivisi().equals("AR")){

            if (getJabatan().equals("Manager")){
                gajiPokok = 7500000;
            } else {
                gajiPokok = 6500000;
            }
        }

        double potongan = (alpa * 150000) + (izin * 75000); 
        
        double bonusLembur = lembur * 100000; 

        double bonus = 0;

        if (lembur >= 5) {
            bonus += bonusLembur; 
        }

        if (alpa == 0 && izin == 0) {
            bonus += gajiPokok; 
        }

        double tunjanganKesehatan = 300000;

        return gajiPokok - potongan + bonus + tunjanganKesehatan;
    }
}
