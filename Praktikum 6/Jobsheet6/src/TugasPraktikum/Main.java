package TugasPraktikum;

public class Main {
    public static void main(String[] args){
        DaftarGaji dp = new DaftarGaji(10);
        Dosen pg1 = new Dosen("Silvia", "123", "Malang");
        Dosen pg2 = new Dosen("Alfia", "124", "Batu");
        Dosen pg3 = new Dosen("Melia", "125", "Jember");
        
        dp.addPegawai(pg1);
        dp.addPegawai(pg2);
        dp.addPegawai(pg3);
        
        pg1.setTARIF_SKS(250000);
        pg2.setTARIF_SKS(250000);
        pg3.setTARIF_SKS(200000);
        
        pg1.setJumlahSKS(2);
        pg2.setJumlahSKS(3);
        pg3.setJumlahSKS(4);
        
        dp.printSemuaGaji();
    }
}
