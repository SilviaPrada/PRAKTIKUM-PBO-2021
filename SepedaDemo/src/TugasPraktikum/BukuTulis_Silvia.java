package TugasPraktikum;

public class BukuTulis_Silvia extends Buku_Silvia {
    private String merk;
    private String jenisKertas;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    
    public void setJenisKertas(String newValue){
        jenisKertas = newValue;
    }
    
    public void cetakInfo(){
        System.out.println("Merk: " + merk);
        System.out.println("Jenis Kertas: " + jenisKertas);
        super.cetakInfo();
    }
}
