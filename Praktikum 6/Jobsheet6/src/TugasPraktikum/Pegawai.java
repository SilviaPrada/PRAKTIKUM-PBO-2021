package TugasPraktikum;

public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getNip() {
        return nip;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }   
}
