import java.util.Scanner;

class Admin {
    private String username;
    private String password;
    
    public Admin() {
        this.username = "Admin355";
        this.password = "password355";
    }
    
    public boolean login(String inputUsername, String inputPassword) {
        if (inputUsername.equals(this.username) && inputPassword.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    
    public Mahasiswa() {
        this.nama = "Abdallah Hayyun";
        this.nim = "202410370110355";
    }
    
    public boolean login(String inputNama, String inputNim) {
        if (inputNama.equals(this.nama) && inputNim.equals(this.nim)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void displayInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
    }
}

public class TUGAS2MODUL2{
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
                System.out.println("Login Admin Berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah");
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
                System.out.println("Login Mahasiswa Berhasil");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login Gagal! Nama atau NIM salah");
            }
        } else {
            System.out.println("PILIHAN tidak valid");
        }
        scanner.close();
    }
}