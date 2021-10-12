package TugasPraktikum;

public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    public void setTARIF_SKS(int TARIF_SKS) {
        this.TARIF_SKS = TARIF_SKS;
    }
    public int getGaji(){
        return this.jumlahSKS*this.TARIF_SKS;
    }
}
