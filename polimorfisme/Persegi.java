package polimorfisme;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        System.out.println("Menghitung Luas Persegi");
        return this.sisi * this.sisi;
    }

    @Override
    public double keliling() {
        System.out.println("Menghitung Keliling Persegi");
        return 4 * this.sisi;
    }
}