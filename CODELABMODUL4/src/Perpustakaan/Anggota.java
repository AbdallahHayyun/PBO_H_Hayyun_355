package Perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;
    private String bukuDipinjam;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.bukuDipinjam = "";
    }

    public String getNama() {
        return nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    @Override
    public void pinjamBuku(String judul) {
        this.bukuDipinjam = judul;
        System.out.println(nama + " (" + idAnggota + ") meminjam buku \"" + judul + "\"");
    }

    @Override
    public void pinjamBuku(String judul, int durasi) {
        this.bukuDipinjam = judul;
        System.out.println(nama + " (" + idAnggota + ") meminjam buku \"" + judul + "\" selama " + durasi + " hari");
    }

    @Override
    public void kembalikanBuku() {
        if (!bukuDipinjam.isEmpty()) {
            System.out.println(nama + " mengembalikan buku \"" + bukuDipinjam + "\"");
            bukuDipinjam = "";
        } else {
            System.out.println(nama + " tidak meminjam buku apapun");
        }
    }
}