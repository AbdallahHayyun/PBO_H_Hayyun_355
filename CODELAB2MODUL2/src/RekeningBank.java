class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    void tampilkanInfo() {
        System.out.println("Informasi Rekening:");
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
        System.out.println();
    }

    void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Transaksi Berhasil!");
            System.out.println("Setor uang sebesar Rp " + jumlah);
            System.out.println("Saldo saat ini: Rp " + saldo);
            System.out.println();
        } else {
            System.out.println("Transaksi Gagal!");
            System.out.println("Jumlah setoran harus lebih dari 0");
            System.out.println();
        }
    }

    void tarikUang(double jumlah) {
        if (jumlah > 0) {
            if (saldo >= jumlah) {
                saldo -= jumlah;
                System.out.println("Transaksi Berhasil!");
                System.out.println("Tarik uang sebesar Rp " + jumlah);
                System.out.println("Saldo saat ini: Rp " + saldo);
                System.out.println();
            } else {
                System.out.println("Transaksi Gagal!");
                System.out.println("Saldo tidak mencukupi untuk melakukan penarikan");
                System.out.println("Saldo saat ini: Rp " + saldo);
                System.out.println();
            }
        } else {
            System.out.println("Transaksi Gagal!");
            System.out.println("Jumlah penarikan harus lebih dari 0");
            System.out.println();
        }
    }
}