package TugasPraktikum;

public class RatuKimSoYoung {
    private String nama;
    private String umur;
    private String masaJabatan;
    private String makanan;
    private String pakaian;

    public RatuKimSoYoung(String nama, String umur, String masaJabatan) {
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
    public void menyiapkanMakanan(String makanan, HongYeon hongyeon){
        System.out.println("Menu makanan hari ini : ");
        System.out.println("Pelayan : ");
        hongyeon.info();
    }
    public void menyiapkanPakaian(String pakaian, DayangChoi choi){
        System.out.println("Pakaian hari ini : ");
        System.out.println("Pelayan : ");
        choi.info();
    }
}
