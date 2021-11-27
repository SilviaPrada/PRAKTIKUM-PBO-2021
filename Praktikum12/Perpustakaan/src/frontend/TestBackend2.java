package frontend;
import backend.*;

public class TestBackend2 {
    public static void main(String[] args) {
        Anggota ang1 = new Anggota("Budi", "Malang", "085294872889");
        Anggota ang2 = new Anggota("Mila", "Pasuruan", "082678117654");
        Anggota ang3 = new Anggota("Andre", "Blitar", "085788255637");

        // test insert
        ang1.save();
        ang2.save();
        ang3.save();

        // test update
        ang2.setAlamat("Jakarta");
        ang2.save();

        // test delete
        ang3.delete();

        // test select all
        for(Anggota a : new Anggota().getAll()){
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }

        // test search
        for(Anggota a : new Anggota().search("Budi")){
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
    }
}
