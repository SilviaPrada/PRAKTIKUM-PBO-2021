package frontend;

import backend.*;
public class TestBackend4
{
    public static void main(String[] args)
    {
        Anggota budi = new Anggota().getById(25);
        Anggota mila = new Anggota().getById(26);
        
        Buku buku1 = new Buku().getById(19);
        Buku buku2 = new Buku().getById(20);
        Buku buku3 = new Buku().getById(21);
        
        Peminjaman pinjam1 = new Peminjaman(budi, buku1, "2021/04/17", "2021/05/01");
        Peminjaman pinjam2 = new Peminjaman(mila, buku2, "2021/04/28", "2021/05/09");
        Peminjaman pinjam3 = new Peminjaman(budi, buku3, "2021/04/30", "2021/05/12");
        
        // test insert
        pinjam1.save();
        pinjam2.save();
        pinjam3.save();

        for(Peminjaman p : new Peminjaman().getAll())
        {
            System.out.println("Nama : " + p.getAnggota().getNama() + ", Tgl pinjam: " + p.getTanggalpinjam());
        }

        // test search
        for(Peminjaman p : new Peminjaman().search("2021/04/28"))
        {
            System.out.println("Nama : " + p.getAnggota().getNama() + ", Tgl pinjam: " + p.getTanggalpinjam());
        }
    }
}
