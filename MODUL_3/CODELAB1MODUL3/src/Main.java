// Kelas Main (Kelas Utama)
public class Main {
    public static void main(String[] args) {
        // Membuat tiga objek
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        // Menampilkan status awal kesehatan Pahlawan dan Musuh
        System.out.println("=== Status Awal ===");
        System.out.println("Kesehatan " + brimstone.getNama() + ": " + brimstone.getKesehatan());
        System.out.println("Kesehatan " + viper.getNama() + ": " + viper.getKesehatan());
        System.out.println();

        // Mensimulasikan pertarungan
        System.out.println("=== Simulasi Pertarungan ===");
        // Brimstone menyerang Viper
        System.out.println("Orbital Strike!");
        brimstone.serang(viper);
        System.out.println();

        // Viper menyerang Brimstone
        System.out.println("Snake Bite!");
        viper.serang(brimstone);
        System.out.println();

        // Menampilkan status akhir
        System.out.println("=== Status Akhir ===");
        System.out.println("Kesehatan " + brimstone.getNama() + ": " + brimstone.getKesehatan());
        System.out.println("Kesehatan " + viper.getNama() + ": " + viper.getKesehatan());
    }
}