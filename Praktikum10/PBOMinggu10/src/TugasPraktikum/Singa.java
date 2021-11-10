package TugasPraktikum;

public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayMakan(){
        System.out.println(this.nama + " memakan daging");
    }
    
    @Override
    public void displayBinatang(){
        System.out.println("Binatang ini adalah " + this.nama);
    }
    
    public void displayData(){
        System.out.println("---------------------------------");
        System.out.println("Nama Binatang : " + this.nama);
        System.out.println("Jumlah Kaki   : " + this.jmlKaki);
        System.out.println("Suara         : " + this.suara);
        System.out.println("Warna Bulu    : " + this.warnaBulu);
        System.out.println("---------------------------------");
    }
}
