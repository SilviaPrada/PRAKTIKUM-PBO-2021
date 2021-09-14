package TugasPraktikum;

public class Lingkaran_Silvia {
    public double phi;
    public double r;

    Lingkaran_Silvia(double phi, double r){
        this.phi = phi;
        this.r = r;
    }
    public double hitungLuas(){
        double luas = phi*r*r;
        return luas;
    }
    public double hitungKeliling(){
        double keliling = 2*phi*r;
        return keliling;
    }

    public static void main(String[] args) {
        
        Lingkaran_Silvia lkr1 = new Lingkaran_Silvia(3.14, 7);

        System.out.println("---------------------------------------------");
        System.out.println("Luas Lingkaran : " + lkr1.hitungLuas());
        System.out.println("Keliling Lingkaran : " + lkr1.hitungKeliling());
        System.out.println("---------------------------------------------");

    }
}
