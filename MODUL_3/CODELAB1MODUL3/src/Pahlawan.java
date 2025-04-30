// Kelas Pahlawan (Subclass dari KarakterGame)
class Pahlawan extends KarakterGame {
    // Constructor menggunakan super()
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override method serang
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
        target.setKesehatan(target.getKesehatan() - 20); // Mengurangi 20 poin kesehatan target
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}
