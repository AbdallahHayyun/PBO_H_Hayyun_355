import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private InventoryManager inventoryManager;
    public UserInterface(InventoryManager inventoryManager){
        this.scanner = new Scanner(System.in);
        this.inventoryManager = inventoryManager;
    }
    public void mulai(){
        boolean lanjut = true;
        while (lanjut){
            tampilkanMenu();
            try{
                int pilihan = scanner.nextInt();
                scanner.nextLine();
                switch (pilihan){
                    case 1:
                        menuTambahBarang();
                        break;
                    case 2:
                        menuTampilkanBarang();
                        break;
                    case 3:
                        menuKurangiStok();
                        break;
                    case 0:
                        lanjut = false;
                        System.out.println("Terima Kasih! program berakhir.");
                        break;
                    default:
                        System.out.println("Menu Tidak Valid.");
                }
            } catch (InputMismatchException e){
                System.out.println("Error: Input harus berupa angka!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
    private void tampilkanMenu(){
        System.out.println("\n==== Menu Manajemen Stok =====");
        System.out.println("1. Tambah Barang Baru");
        System.out.println("2. Tampilkan Semua Barang");
        System.out.println("3. Kurangi Stok Barang");
        System.out.println("0. Keluar");
        System.out.print("Pilih Opsi: ");
    }
    private void menuTambahBarang() {
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        try{
            System.out.print("Masukkan Stok Awal:");
            int stok = scanner.nextInt();
            scanner.nextLine();
            try{
                inventoryManager.tambahBarang(nama, stok);
                System.out.println("Barang '" + nama + "' berhasil ditambahkan dengan stok " + stok);
            } catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }
        } catch (InputMismatchException e){
            System.out.println("Error: input stok harus berupa angka!");
            scanner.nextLine();
        }
    }
    private void menuTampilkanBarang(){
        if (inventoryManager.isDaftarKosong()){
            System.out.println("Stok barang kosong");
            return;
        }
        ArrayList<Barang> daftarBarang = inventoryManager.getDaftarBarang();
        for (int i = 0; i < daftarBarang.size(); i++){
            Barang barang = daftarBarang.get(i);
            System.out.println(i + ". Nama: " + barang.getNama() + ", Stok: " + barang.getStok());
        }
    }
    private void menuKurangiStok(){
        if (inventoryManager.isDaftarKosong()){
            System.out.println("Stok barang kosong");
            return;
        }
        menuTampilkanBarang();
        System.out.println("--- Daftar Barang (pilih untuk kurangi stok) ---");
        try{
            System.out.print("\nMasukkan nomor indeks barang: ");
            int indeks = scanner.nextInt();
            System.out.print("Masukkan jumlah stok yang akan diambil: ");
            int jumlahDiambil = scanner.nextInt();
            scanner.nextLine();
            try {
                Barang barang = inventoryManager.getBarang(indeks);
                inventoryManager.kurangiStok(indeks, jumlahDiambil);
                System.out.println("Berhasil mengurangi stok '" + barang.getNama() + "' sebanyak " + jumlahDiambil + ". Stok tersisa: " + barang.getStok());
            }catch (IndexOutOfBoundsException e){
                System.out.println("Error: " + e.getMessage());
            }catch (StokTidakCukupException e){
                System.out.println("Error: " + e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }
        }catch (InputMismatchException e){
            System.out.println("Error: Input harus berupa angka!");
            scanner.nextLine();
        }
    }
}
