package TugasPraktikum;

public class Main {
    public static void main(String[] args){
        RajaCheoljong cj = new RajaCheoljong("Kim Cheol Jeong", "35", "1849-1863"); 
        RatuKimSoYoung ksy = new RatuKimSoYoung("Kim So Young", "30", "1849-1863");
        HongYeon hy = new HongYeon("Hong Yeon", "Perempuan", "Pelayan");
        DayangChoi ch = new DayangChoi("Choi", "Perempuan", "Pelayan");
        Kerajaan kj = new Kerajaan("Joseon", cj);
        
        System.out.println("--------------------------------------");
        System.out.println("            Data Kerajaan");
        System.out.println("--------------------------------------");
        System.out.println("Kerajaan : " + kj.getNamaKerajaan());
        System.out.println("Raja : ");
        cj.info();
        System.out.println("Ratu : ");
        ksy.info();
        System.out.println("Data Kegiatan Kerajaan : \n");
        ksy.menyiapkanMakanan("Jajangmyeon", hy);
        ksy.menyiapkanPakaian("Hanbok", ch);
    }
}
