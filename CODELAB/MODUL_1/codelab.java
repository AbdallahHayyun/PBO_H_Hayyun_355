import java.time.LocalDate;
import java.util.Scanner;

public class codelab{

    public static void main(String[] args) {
        Scanner jgn = new Scanner(System.in);

        System.out.format("Masukkan nama: ");
        String nama = jgn.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = jgn .next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = jgn.nextInt();

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        String jenisKelaminString;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminString = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminString = "Perempuan";
        } else {
            jenisKelaminString = "Jenis kelamin tidak valid";
        }

        System.out.println("\nData Diri:");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + jenisKelaminString);
        System.out.println("Umur\t\t\t: " + umur + " tahun");

        jgn.close();
    }
}