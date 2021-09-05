package TugasPraktikum;

public class Demo_Silvia {
    
    public static void main(String[] args){
        
        Pohon_Silvia phn = new Pohon_Silvia();
        Kaos_Silvia ks = new Kaos_Silvia();
        Buku_Silvia bk1 = new Buku_Silvia();
        BukuTulis_Silvia bk2 = new BukuTulis_Silvia();
        Novel_Silvia bk3 = new Novel_Silvia();
        
        phn.setJenis("Pohon Jati");
        phn.setTinggi((float) 2.5);
        phn.cetakInfo();
        System.out.println();
        
        ks.setMerk("Oyisam");
        ks.setUkuran("L");
        ks.cetakInfo();
        System.out.println();
        
        bk1.setUkuran("21x16");
        bk1.setJumlahHalaman(200);
        bk1.cetakInfo();
        System.out.println();
        
        bk2.setUkuran("21x16");
        bk2.setJumlahHalaman(116);
        bk2.setMerk("Sinar Dunia");
        bk2.setJenisKertas("Bergaris");
        bk2.cetakInfo();
        System.out.println();
        
        bk1.setUkuran("14x20");
        bk1.setJumlahHalaman(416);
        bk3.setJudul("Antares");
        bk3.setPenerbit("Loveable");
        bk3.cetakInfo();
    }
}
