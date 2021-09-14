package Praktikum2;

public class TestBarang_Silvia {
    public static void main(String[] args){
        Barang_Silvia brg1 = new Barang_Silvia();
        
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        
        System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
    }
}
