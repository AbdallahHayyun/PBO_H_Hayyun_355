package App;
import Perpustakaan.Anggota;
import Perpustakaan.Buku;
import Perpustakaan.Fiksi;
import Perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        Buku bukuFiksi = new Fiksi("Attack On Titan", "Hajime Isayama", "Fantasy");
        Buku bukuNonFiksi = new NonFiksi("Pemrograman Java", "James Gosling", "Komputer");

        bukuFiksi.displayInfo();
        System.out.println();
        bukuNonFiksi.displayInfo();
        System.out.println();

        Anggota anggota1 = new Anggota("Hayyun", "NIM: 355");
        Anggota anggota2 = new Anggota("Abdallah", "NIM: 666");

        anggota1.pinjamBuku("Attack On Titan");
        anggota2.pinjamBuku("Pemrograman Java", 7);
        System.out.println();

        anggota1.kembalikanBuku();
        anggota2.kembalikanBuku();
    }
}