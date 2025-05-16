public class Main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank();
        rekening1.nomorRekening = "202410370110355";
        rekening1.namaPemilik = "Abdallah Hayyun";
        rekening1.saldo = 500000.0;

        RekeningBank rekening2 = new RekeningBank();
        rekening2.nomorRekening = "66666666";
        rekening2.namaPemilik = "Hayyun";
        rekening2.saldo = 1000000.0;
        
        System.out.println("===== Rekening 1 =====");
        rekening1.tampilkanInfo();

        rekening1.setorUang(200000.0);
        rekening1.tarikUang(800000.0);

        System.out.println("===== Rekening 2 =====");
        rekening2.tampilkanInfo();

        rekening2.setorUang(500000.0);
        rekening2.tarikUang(300000.0);
    }
}