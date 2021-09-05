package TugasPraktikum;

public class Buku_Silvia {
    private String ukuran;
    private int jumlahHalaman;
    
    public void setUkuran(String newValue){
        ukuran = newValue;
    }
    
    public void setJumlahHalaman(int newValue){
        jumlahHalaman = newValue;
    }
    
    public void cetakInfo(){
        System.out.println("Ukuran Buku: " + ukuran + " cm");
        System.out.println("Jumlah Halaman: " + jumlahHalaman + " halaman");
    }
}
