package TugasPraktikum;

import java.util.Scanner;
public class TestKoperasi_Silvia {
    public static void main(String[] args){
        Scanner silvia = new Scanner(System.in);
        
        System.out.print("Masukkan No KTP : ");
        String ktp = silvia.next();
        System.out.print("Masukkan Nama Anggota : ");
        String agt = silvia.next();
        System.out.print("Masukkan Limit Pinjaman : ");
        int pjm = silvia.nextInt();
        System.out.println();
        
        Anggota_Silvia ang = new Anggota_Silvia(ktp, agt, pjm);
        
        int pilih;
        do{
           
        System.out.println("---------------------------------");
        System.out.println("                Menu");
        System.out.println("---------------------------------");
        System.out.println("1. Pinjam");
        System.out.println("2. Angsur");
        System.out.println("3. Tampil Pinjaman");
        System.out.println("4. Tampil limit pinjaman");
        System.out.println("5. Keluar");
        System.out.println("Pilih : ");
        pilih = silvia.nextInt();
        System.out.println("---------------------------------");
        
        switch(pilih){
            case 1:
                System.out.println("Masukkan jumlah uang yang akan dipinjam!");
                System.out.print("Pinjam : ");
                int pinjam = silvia.nextInt();
                ang.pinjam(pinjam);
                break;
            case 2:
                System.out.println("Masukkan jumlah pinjaman yang diangsur!");
                System.out.print("Angsur : ");
                int angsur = silvia.nextInt();
                ang.angsur(angsur);
                break;
            case 3:
                System.out.println("Nama Anggota : " + ang.getNama());
                System.out.println("Jumlah Pinjaman : " + ang.getJumlahPinjaman());
                break;
            case 4:
                System.out.println("Nama Anggota : " + ang.getNama());
                System.out.println("Limit Pinjaman : " + ang.getLimitPinjaman());
                break;
            }
        }while(pilih >0 && pilih <5);
    }
}
