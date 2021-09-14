package TugasPraktikum;

public class Peminjaman_Silvia {
    public int id;
    public String namaMember;
    public String namaGame;

    public void setId(int newValue){
        id = newValue;
    }
    public void setNamaMember(String newValue){
        namaMember = newValue;
    }
    public void setNamaGame(String newValue){
        namaGame = newValue;
    }
    public void tampilDataPeminjaman(){
        System.out.println("ID Member : " + id);
        System.out.println("Nama      : " + namaMember);
        System.out.println("Game      : " + namaGame);
    }
}
