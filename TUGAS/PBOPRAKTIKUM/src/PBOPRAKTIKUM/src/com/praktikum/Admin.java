package com.praktikum;
import actions.AdminActions;
import java.util.Scanner;

public class Admin extends User implements AdminActions{
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin Berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("Username: " + username);
    }

    @Override
    public void manageItems(){
        System.out.println(">> Fitur kelola barang belum tersedia <<");
    }

    @Override
    public void manageUsers(){
        System.out.println(">> Fitur Kelola Mahasiswa belum tersedia <<");
    }

    @Override
    public void displayAppMenu(){
        Scanner scanner = new Scanner(System.in);
        int pilihan = -1;

        while (pilihan != 0){
            System.out.println("\n=== MENU ADMIN ===");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan){
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    System.out.println("Logout berhasil!");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
            }
        }
    }
}