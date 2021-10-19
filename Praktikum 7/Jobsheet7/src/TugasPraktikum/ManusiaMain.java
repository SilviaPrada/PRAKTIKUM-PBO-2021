package TugasPraktikum;

public class ManusiaMain {
    public static void main(String[] args){
        Manusia manusia1 =  new Manusia();
        Dosen dosen1 = new Dosen();
        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        System.out.println("----Keseharian Manusia----");
        manusia1.bernafas();
        manusia1.makan();
        
        System.out.println("----Keseharian Dosen----");
        dosen1.bernafas();
        dosen1.makan();
        dosen1.lembur();
        
        System.out.println("----Keseharian Mahasiswa----");
        mahasiswa1.bernafas();
        mahasiswa1.makan();
        mahasiswa1.tidur();
    }
    
}
