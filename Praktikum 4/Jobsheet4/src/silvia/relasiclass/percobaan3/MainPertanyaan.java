package silvia.relasiclass.percobaan3;

public class MainPertanyaan {
    public static void main(String[] args){
        Pegawai_Silvia masinis = new Pegawai_Silvia("1234", "Spongebob Squarepants");
        Pegawai_Silvia asisten = new Pegawai_Silvia("5678", "Shandy Chiks");
        KeretaApi_Silvia keretaApi = new KeretaApi_Silvia("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
