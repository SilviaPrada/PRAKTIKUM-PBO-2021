package TugasPraktikum;

public class Barang_Silvia {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    int hitungHargaJual(){
        float hargaDiskon = diskon/100*hargaDasar;
        int hargaJual = hargaDasar - ((int)hargaDiskon);
        return hargaJual;
    }
    void tampilData(){
        System.out.println("Kode    : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon      : " + diskon);
        System.out.println("Harga Jual  : " + hitungHargaJual());
    }
    public static void main(String[] args) {
        
        Barang_Silvia brg1 = new Barang_Silvia();

        brg1.kode = "204";
        brg1.namaBarang = "Buku Tulis";
        brg1.hargaDasar = 50000;
        brg1.diskon = 20;
        brg1.hitungHargaJual();
        brg1.tampilData();
    }
}
