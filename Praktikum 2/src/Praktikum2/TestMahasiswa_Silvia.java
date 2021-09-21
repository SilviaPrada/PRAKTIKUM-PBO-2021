package Praktikum2;

public class TestMahasiswa_Silvia {
    public static void main(String[] args) {
        Mahasiswa_Silvia mhs1 = new Mahasiswa_Silvia();
        Mahasiswa_Silvia mhs2 = new Mahasiswa_Silvia();
        Mahasiswa_Silvia mhs3= new Mahasiswa_Silvia();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println();

        mhs2.nim = 102;
        mhs2.nama = "Mentari";
        mhs2.alamat = "Jl. Mangga No 1B";
        mhs2.kelas = "1B";
        mhs2.tampilBiodata();
        System.out.println();

        mhs3.nim = 103;
        mhs3.nama = "Senja";
        mhs3.alamat = "Jl. Melati No 2A";
        mhs3.kelas = "1C";
        mhs3.tampilBiodata();
        System.out.println();
    }
}
