package TugasPraktikum;

public class Main_Silvia {
    public static void main(String[] args) {

        Peminjaman_Silvia pjm1 = new Peminjaman_Silvia();
        Pembayaran_Silvia pby1 = new Pembayaran_Silvia();
        
        System.out.println("----------------------");
        System.out.println("    Data Peminjaman");
        System.out.println("----------------------");
        pjm1.setId(012);
        pjm1.setNamaMember("Yanto");
        pjm1.setNamaGame("Valorant");
        pjm1.tampilDataPeminjaman();
        
        System.out.println("----------------------");
        System.out.println("    Nota Pembayaran");
        System.out.println("----------------------");
        pby1.setId(012);
        pby1.setNamaMember("Yanto");
        pby1.setNamaGame("Valorant");
        pby1.setLamaSewa(3);
        pby1.setHarga(20000);
        pby1.HargaBayar();
        pby1.tampilNotaPembayaran();

    }
}
