class Hewan {
    String Nama;
    String Jenis;
    String Suara;
        void tampilkanInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis: " + Jenis);
        System.out.println("Suara: " + Suara);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        hewan1.Nama = "Kucing";
        hewan1.Jenis = "Mamalia";
        hewan1.Suara = "Nyann~~";

        Hewan hewan2 = new Hewan();
        hewan2.Nama = "Anjing";
        hewan2.Jenis = "Mamalia";
        hewan2.Suara = "Woof-Woof!!";
        
        System.out.println("Informasi Hewan 1:");
        hewan1.tampilkanInfo();

        System.out.println("Informasi Hewan 2:");
        hewan2.tampilkanInfo();
    }
}