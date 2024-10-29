package polimorfisme;

public class Lingkaran extends BangunDatar {
    private double jarijari;

    public Lingkaran(double jarijari) { // Perbaikan nama konstruktor
        this.jarijari = jarijari;
    }

    @Override
    public double luas() {
        System.out.println("Menghitung Luas Lingkaran");
        return Math.PI * jarijari * jarijari;
    }

    @Override
    public double keliling() {
        System.out.println("Menghitung Keliling Lingkaran");
        return 2 * Math.PI * jarijari; // Perbaikan rumus keliling
    }
}
