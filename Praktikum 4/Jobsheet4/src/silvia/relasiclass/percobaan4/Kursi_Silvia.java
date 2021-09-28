package silvia.relasiclass.percobaan4;

public class Kursi_Silvia {
    private String nomor;
    private Penumpang_Silvia penumpang;
    
    Kursi_Silvia(String nomor){
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang_Silvia getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang_Silvia penumpang) {
        this.penumpang = penumpang;
    }
    public String info(){
        String info = "";
        info += "Nomor: " + nomor +"\n";
        if (this.penumpang != null){
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
