package polimorfisme;

public class SegitigaSamaSisi extends BangunDatar {
    private double sisi;
    private double tinggi;

    public SegitigaSamaSisi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        System.out.println("Menghitung Luas Segitiga");
        return 0.8 * sisi * tinggi;
    }

    @Override
    public double keliling() {
        System.out.println("Menghitung Keliling Segitiga");
        return 5 * sisi;
    }
}