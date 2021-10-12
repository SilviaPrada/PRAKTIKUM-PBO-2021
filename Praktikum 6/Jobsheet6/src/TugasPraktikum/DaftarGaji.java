package TugasPraktikum;

public class DaftarGaji {
    public Dosen listPegawai[];

    public DaftarGaji(int jumlah) {
        this.listPegawai = new Dosen[jumlah];
    }
    public void addPegawai(Dosen dosen){
        for(int i=0; i<listPegawai.length; i++){
            if(this.listPegawai[i] == null){
                this.listPegawai[i] = dosen;
                break;
            }
        }
    }
    public void printSemuaGaji(){
        for(int i=0; i<listPegawai.length; i++){
            if(this.listPegawai[i] != null){
                System.out.println("------------------------");
                System.out.println("Nama    : " + listPegawai[i].getNama());
                System.out.println("NIP     : " + listPegawai[i].getNip());
                System.out.println("Alamat  : " + listPegawai[i].getAlamat());
                System.out.println("Gaji    : " + listPegawai[i].getGaji());
                System.out.println("------------------------");
            }
        }
    }
}
    
