package TugasPraktikum;

public class Novel_Silvia extends Buku_Silvia {
    private String judul;
    private String penerbit;
    
    public void setJudul(String newValue){
        judul = newValue;
    }
    
    public void setPenerbit(String newValue){
        penerbit = newValue;
    }
    
    public void cetakInfo(){
        System.out.println("Judul: " + judul);
        System.out.println("Penerbit: " + penerbit);
        super.cetakInfo();
    }
}
