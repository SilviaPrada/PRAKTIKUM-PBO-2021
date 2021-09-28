package silvia.relasiclass.percobaan2;

public class Main_Percobaan2 {
    public static void main(String[] args){
        Mobil_Silvia m = new Mobil_Silvia();
        m.setMerk("Avanza");
        m.setBiaya(3500000);
        
        Sopir_Silvia s = new Sopir_Silvia();
        s.setNama("John Doe");
        s.setBiaya(200000);
        
        Pelanggan_Silvia p = new Pelanggan_Silvia();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        
        System.out.println("Biaya Total = " + p.hitungBiayaTotal());
        System.out.println(p.getMobil().getMerk());
    }
}
