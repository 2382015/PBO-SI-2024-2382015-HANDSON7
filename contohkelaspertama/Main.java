package contohkelaspertama;

public class Main {
    public static void main(String[] args) {
        Mobil mobilHitam = new Mobil("Hitam", "Toyota", 188);
        mobilHitam.tampilkanInfo();
        mobilHitam.berjalan();
        mobilHitam.berhenti();

        Mobil mobilMerah = new Mobil("Merah", "Honda", 200);
        mobilMerah.tampilkanInfo();
        mobilMerah.berjalan();
        mobilMerah.berhenti();
    }
}
