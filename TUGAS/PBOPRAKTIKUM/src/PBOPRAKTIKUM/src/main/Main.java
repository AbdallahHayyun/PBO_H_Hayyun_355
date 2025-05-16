package main;
import com.praktikum.Admin;
import com.praktikum.Mahasiswa;
import com.praktikum.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Abdallah Hayyun", "202410370110355", "Admin355", "password355");
        Mahasiswa mahasiswa = new Mahasiswa("Abdallah Hayyun", "202410370110355");

        System.out.println("=== SISTEM LOGIN ===");
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        User user = null;
        boolean loginBerhasil = false;

        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            loginBerhasil = admin.login(username, password);

            if (loginBerhasil) {
                admin.displayInfo();
                user = admin;
            } else {
                System.out.println("Login Admin gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            loginBerhasil = mahasiswa.login(nama, nim);

            if (loginBerhasil) {
                mahasiswa.displayInfo();
                user = mahasiswa;
            } else {
                System.out.println("Login Mahasiswa gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        if(loginBerhasil && user != null){
            user.displayAppMenu();
        }

        scanner.close();
    }
}