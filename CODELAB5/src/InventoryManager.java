import java.util.ArrayList;
public class InventoryManager {
        private ArrayList<Barang> daftarBarang;
        public InventoryManager(){
            daftarBarang = new ArrayList<>();
        }
        public void tambahDataAwal(){
            daftarBarang.add(new Barang("Pensil", 50));
        }
        public void tambahBarang(String nama, int stok){
            if (stok < 0){
                throw new IllegalArgumentException("Stok tidak boleh habis!");
            }
            daftarBarang.add(new Barang(nama, stok));
        }
        public ArrayList<Barang> getDaftarBarang(){
            return daftarBarang;
        }
        public boolean isDaftarKosong(){
            return daftarBarang.isEmpty();
        }
        public Barang getBarang(int indeks){
            if(indeks < 0 || indeks >= daftarBarang.size()){
                throw new IndexOutOfBoundsException("Indeks barang tidak valid!");
            }
            return daftarBarang.get(indeks);
        }
        public void kurangiStok(int indeks,int jumlah) throws StokTidakCukupException{
            if (jumlah < 0){
                throw new IllegalArgumentException("Jumlah yang diambil tidak boleh negatif");
            }
            Barang barang = getBarang(indeks);
            if (jumlah > barang.getStok()){
                throw new StokTidakCukupException("Stok untuk " + barang.getNama() + "hanya tersisa " + barang.getStok());
            }
            barang.setStok(barang.getStok() - jumlah);
        }
}