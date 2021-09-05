package TugasPraktikum;

public class Kaos_Silvia {
    private String merk;
    private String ukuran;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    
    public void setUkuran(String newValue){
        ukuran = newValue;
    }
    
    public void cetakInfo(){
        System.out.println("Merk Kaos: " + merk);
        System.out.println("Ukuran Kaos: " + ukuran);
    }
}
