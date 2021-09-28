package silvia.relasiclass.percobaan4;

public class Gerbong_Silvia {
    private String kode;
    private Kursi_Silvia arrayKursi[];

    public Gerbong_Silvia(String kode, int jumlah) {
        this.kode = kode;
        arrayKursi = new Kursi_Silvia[jumlah];
        this.initKursi();
    }
    private void initKursi(){
        for (int i = 0; i< arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi_Silvia(String.valueOf(i + 1));
        }
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi_Silvia kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
    public void setPenumpang(Penumpang_Silvia penumpang, int nomor) {
        if (this.arrayKursi[nomor - 1].getPenumpang()!= null){
            System.out.println("Kursi sudah ditempati\n");
        }else{
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }
    }
}
