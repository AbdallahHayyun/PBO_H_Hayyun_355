import java.util.Scanner;

public class TUGAS1MODUL1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //pilihan login
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt(); //membaca pilihan login
        scanner.nextLine(); //biar bisa masukkin nama & pw secara berurutan

        //milih admin
        if (pilihan == 1){
            //proses login admin
            System.out.print("Masukkan Nama: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            //username ma pw yg btul
            String usernameGuwe = "Admin355";
            String passwordGuwe = "password355";
            
            //cek username dan pw benar atau salah
            if (username.equals(usernameGuwe) && password.equals(passwordGuwe)){
                System.out.println("Login Admin Berhasil wak!");
            } else {
                System.out.println("Login gagal! Username atau password salah kocak");
            }
        } else if (pilihan == 2) { //milih mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            //nama ma nim buat login
            String namaGuwe = "Abdallah Hayyun";
            String nimGuwe = "202410370110355";

            if (nama.equals(namaGuwe) && nim.equals(nimGuwe)) {
                System.out.println("Login Mahasiswa Berhasil bwang!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login Gagal! Nama atau NIM SALAH KOCAKK");
            }
        } else {
            System.out.println("PILIHAN GADA");
        }
        scanner.close();
    }
}