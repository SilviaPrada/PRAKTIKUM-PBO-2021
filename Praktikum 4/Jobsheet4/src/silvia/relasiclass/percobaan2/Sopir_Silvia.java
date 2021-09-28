package silvia.relasiclass.percobaan2;

public class Sopir_Silvia {
    private String nama;
    private int biaya;
    
    Sopir_Silvia(){
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public int hitungBayarSopir(int hari){
        return biaya*hari;
    }
}
