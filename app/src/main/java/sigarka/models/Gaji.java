package sigarka.models;

public class Gaji {
    private double gajiPokok;
    private double bonus;
    private double potongan;

    public Gaji(double gajiPokok, double bonus, double potongan) {
        this.gajiPokok = gajiPokok;
        this.bonus = bonus;
        this.potongan = potongan;
    }

    public double hitungTotalGaji() {
        return gajiPokok + bonus - potongan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getBonus() {
        return bonus;
    }

    public double getPotongan() {
        return potongan;
    }
}