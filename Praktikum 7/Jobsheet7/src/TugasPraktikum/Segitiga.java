package TugasPraktikum;

public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        return this.sudut = 180-sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return this.sudut = 180 - (sudutA + sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiB;
    }
    public double keliling(int sisiA, int sisiB){
        return Math.sqrt(sisiA^2) + Math.sqrt(sisiB^2);
    }
}
