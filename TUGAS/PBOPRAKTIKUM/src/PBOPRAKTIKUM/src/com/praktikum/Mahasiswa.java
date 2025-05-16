package com.praktikum;
import actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(getNama()) && inputNim.equals(getNim());
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa Berhasil!");
        super.displayInfo();
    }

    @Override
    public void reportItem () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n== LAPORAN BARANG ==");
        System.out.println("Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.println("Deskripsi Barang: ");
        String deskripsiBarang = scanner.nextLine();

        System.out.println("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println("\n Konfirmasi Laporan: ");
        System.out.println("Barang: " + namaBarang);
        System.out.println("Deskripsi: " + deskripsiBarang);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Laporan Berhasil Disimpan");
    }

    @Override
    public void viewReportedItems(){
        System.out.println(">> Fitur lihat laporan belum tersedia <<");
    }

    @Override
    public void displayAppMenu (){
        Scanner scanner = new Scanner(System.in);
        int pilihan = -1;

        while (pilihan != 0){
            System.out.println("\n== MENU MAHASISWA ==");
            System.out.println("1. Laporkan Barang Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan){
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Berhasil Logout");
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }

    }
}