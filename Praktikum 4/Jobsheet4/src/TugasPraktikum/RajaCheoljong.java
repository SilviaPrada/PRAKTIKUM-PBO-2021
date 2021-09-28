package TugasPraktikum;

public class RajaCheoljong {
    private String nama;
    private String umur;
    private String masaJabatan;

    public RajaCheoljong(String nama, String umur, String masaJabatan) {
        this.nama = nama;
        this.umur = umur;
        this.masaJabatan = masaJabatan;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getMasaJabatan() {
        return masaJabatan;
    }

    public void setMasaJabatan(String masaJabatan) {
        this.masaJabatan = masaJabatan;
    }
    
    public void info(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Masa Jabatan : " + masaJabatan);
    }
}
