package TugasPraktikum;

public class SegitigaMain {
    public static void main(String[] args){
        Segitiga sgt1 = new Segitiga();
        Segitiga sgt2 = new Segitiga();
        
        System.out.println("------Data Segitiga 1-------");
        System.out.println("Total Sudut : " + sgt1.totalSudut(80));
        System.out.println("Keliling : " + sgt1.keliling(6, 8)+ "\n");
        
        System.out.println("------Data Segitiga 2-------");
        System.out.println("Total Sudut : " + sgt1.totalSudut(80, 30));
        System.out.println("Keliling : " + sgt1.keliling(6, 8, 4));
    }
}
