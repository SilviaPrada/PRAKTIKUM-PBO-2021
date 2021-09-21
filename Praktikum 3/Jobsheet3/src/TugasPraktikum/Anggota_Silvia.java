package TugasPraktikum;

public class Anggota_Silvia {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    
    Anggota_Silvia (String nomorKTP, String nama, int limitPinjaman){
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public void pinjam(int uang){
        if (uang > limitPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }else{
            jumlahPinjaman += uang;
        }
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void angsur(int uang){
        float persen = jumlahPinjaman*10/100;
        
        if(uang <persen){
            System.out.println("Maaf, angsuran haruss 10% dari jumlah pinjaman");
        }else{
            jumlahPinjaman -= uang;
        }
    }
}
