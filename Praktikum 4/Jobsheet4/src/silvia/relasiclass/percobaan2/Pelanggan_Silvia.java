package silvia.relasiclass.percobaan2;

public class Pelanggan_Silvia {
    private String nama;
    private Mobil_Silvia mobil;
    private Sopir_Silvia sopir;
    private int hari;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mobil_Silvia getMobil() {
        return mobil;
    }

    public void setMobil(Mobil_Silvia mobil) {
        this.mobil = mobil;
    }

    public Sopir_Silvia getSopir() {
        return sopir;
    }

    public void setSopir(Sopir_Silvia sopir) {
        this.sopir = sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBayarSopir(hari);
    }
}
