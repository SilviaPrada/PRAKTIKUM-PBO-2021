package TugasPraktikum;

public class Pohon_Silvia {
    private String jenis;
    private float tinggi;
    
    public void setJenis(String newValue){
        jenis = newValue;
    }
    
    public void setTinggi(float newValue){
        tinggi = newValue;
    }
    
    public void cetakInfo(){
        System.out.println("Jenis Pohon: " + jenis);
        System.out.println("Tinggi Pohon: " + tinggi + " m");
    }
}
