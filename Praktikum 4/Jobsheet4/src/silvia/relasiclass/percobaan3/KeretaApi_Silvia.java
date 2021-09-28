package silvia.relasiclass.percobaan3;

public class KeretaApi_Silvia {
    private String nama;
    private String kelas;
    private Pegawai_Silvia masinis;
    private Pegawai_Silvia asisten;
    
    KeretaApi_Silvia(String nama, String kelas, Pegawai_Silvia masinis, Pegawai_Silvia asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public Pegawai_Silvia getMasinis() {
        return masinis;
    }

    public void setMasinis(Pegawai_Silvia masinis) {
        this.masinis = masinis;
    }

    public Pegawai_Silvia getAsisten() {
        return asisten;
    }

    public void setAsisten(Pegawai_Silvia asisten) {
        this.asisten = asisten;
    }
    
    public String info(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
}
