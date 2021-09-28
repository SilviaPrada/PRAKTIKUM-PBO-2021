package silvia.relasiclass.percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args){
        Penumpang_Silvia p = new Penumpang_Silvia("12345", "Mr. Krab");
        Gerbong_Silvia gerbong = new Gerbong_Silvia("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
        
        Penumpang_Silvia budi = new Penumpang_Silvia("678910", "Mr. Budi");
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }
}
