package abstraksi;

abstract class kendaraan {
    String warna;

    public kendaraan(final String warna) {
        this.warna = warna;
    }

    abstract void bergerak();

    void info() {
        System.out.println("warna : " + warna);
    }
}

