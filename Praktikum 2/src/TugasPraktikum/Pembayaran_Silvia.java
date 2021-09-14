package TugasPraktikum;

public class Pembayaran_Silvia extends Peminjaman_Silvia{
    public int lamaSewa;
    public int harga;
    public int bayar;

    public void setLamaSewa(int newValue){
        lamaSewa = newValue;
    }
    public void setHarga(int newValue){
        harga = newValue;
    }
    public void HargaBayar(){
        bayar = lamaSewa*harga;
    }
    public void tampilNotaPembayaran(){
        super.tampilDataPeminjaman();
        System.out.println("Harga satuan : " + harga);
        System.out.println("Sewa         : " + lamaSewa + " Hari");
        System.out.println("Bayar        : " + bayar);
    }
    
}
