package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Peminjaman {
    
    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tanggalpinjam;
    private String tanggalkembali;

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public Peminjaman() {
    }

    public Peminjaman(Anggota anggota, Buku buku, String tanggalpinjam, String tanggalkembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }
    
    
    
    public Peminjaman getById(int id) {
        Peminjaman pinjam = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                            + " p.idpeminjaman AS idpeminjaman, "
                                            + " p.tanggalpinjam AS tanggalpinjam, "
                                            + " p.tanggalkembali AS tanggalkembali, "
                                            + " a.idanggota AS idanggota, "
                                            + " a.nama AS nama, "
                                            + " a.alamat AS alamat, "
                                            + " a.telepon AS telepon, "
                                            + " b.idbuku AS idbuku, "
                                            + " b.kategori AS kategori, "
                                            + " b.judul AS judul, "
                                            + " b.penerbit AS penerbit, "
                                            + " b.penulis AS penulis, "
                                            + " FROM peminjaman p "
                                            + " LEFT JOIN anggota a ON p.idanggota = a.anggota "
                                            + " LEFT JOIN buku b ON p.idbuku = b.buku "
                                            + " WHERE p.idpeminjaman = '" + id + "'");
        try {
            while(rs.next()){
                pinjam = new Peminjaman();
                pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pinjam.getAnggota().setNama(rs.getString("nama"));
                pinjam.getAnggota().setAlamat(rs.getString("alamat"));
                pinjam.getAnggota().setTelepon(rs.getString("telepon"));
                pinjam.getBuku().setIdbuku(rs.getInt("idbuku"));
                pinjam.getBuku().getKategori();
                pinjam.getBuku().setJudul(rs.getString("judul"));
                pinjam.getBuku().setPenerbit(rs.getString("penerbit"));
                pinjam.getBuku().setPenulis(rs.getString("penulis"));
                pinjam.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembali(rs.getString("tanggalkembali"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return pinjam;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPinjam = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + " p.idpeminjaman AS idpeminjaman, "
                                        + " p.tanggalpinjam AS tanggalpinjam, "
                                        + " p.tanggalkembali AS tanggalkembali, "
                                        + " a.idanggota AS idanggota, "
                                        + " a.nama AS nama, "
                                        + " a.alamat AS alamat, "
                                        + " a.telepon AS telepon, "
                                        + " b.idbuku AS idbuku, "
                                        + " b.idkategori AS idkategori, "
                                        + " b.judul AS judul, "
                                        + " b.penerbit AS penerbit, "
                                        + " b.penulis AS penulis, "
                                        + " FROM peminjaman p "
                                        + " LEFT JOIN anggota a ON p.idanggota = a.anggota "
                                        + " LEFT JOIN buku b ON p.idbuku = b.buku");
        try {
            while(rs.next()){
                Peminjaman pinjam = new Peminjaman();
                pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pinjam.getAnggota().setNama(rs.getString("nama"));
                pinjam.getAnggota().setAlamat(rs.getString("alamat"));
                pinjam.getAnggota().setTelepon(rs.getString("telepon"));
                pinjam.getBuku().setIdbuku(rs.getInt("idbuku"));
                pinjam.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                pinjam.getBuku().setJudul(rs.getString("judul"));
                pinjam.getBuku().setPenerbit(rs.getString("penerbit"));
                pinjam.getBuku().setPenulis(rs.getString("penulis"));
                pinjam.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPinjam.add(pinjam);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> ListPinjam = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT "
                                                + " p.idpeminjaman AS idpeminjaman, "
                                                + " p.tanggalpinjam AS tanggalpinjam, "
                                                + " p.tanggalkembali AS tanggalkembali, "
                                                + " a.idanggota AS idanggota, "
                                                + " a.nama AS nama, "
                                                + " a.alamat AS alamat, "
                                                + " a.telepon AS telepon, "
                                                + " b.idbuku AS idbuku, "
                                                + " b.idkategori AS idkategori, "
                                                + " b.judul AS judul, "
                                                + " b.penerbit AS penerbit, "
                                                + " b.penulis AS penulis, "
                                                + " FROM peminjaman p "
                                                + " LEFT JOIN anggota a ON p.idanggota = a.anggota "
                                                + " LEFT JOIN buku b ON p.idbuku = b.buku"
                                                + " WHERE p.tanggalpinjam LIKE '%" + keyword + "%' "
                                                + "     OR p.tanggalkembali LIKE '%" + keyword + "%'");
        try {
            while(rs.next()){
                Peminjaman pinjam = new Peminjaman();
                pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pinjam.getAnggota().setNama(rs.getString("nama"));
                pinjam.getAnggota().setAlamat(rs.getString("alamat"));
                pinjam.getAnggota().setTelepon(rs.getString("telepon"));
                pinjam.getBuku().setIdbuku(rs.getInt("idbuku"));
                pinjam.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                pinjam.getBuku().setJudul(rs.getString("judul"));
                pinjam.getBuku().setPenerbit(rs.getString("penerbit"));
                pinjam.getBuku().setPenulis(rs.getString("penulis"));
                pinjam.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPinjam.add(pinjam);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void save() {
    if(getById(idpeminjaman).getIdpeminjaman() == 0){
        String SQL = "INSERT INTO peminjaman (idkategori, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                        + " '" + this.getAnggota().getIdanggota() + "', "
                        + " '" + this.getBuku().getIdbuku() + "', "
                        + " '" + this.tanggalpinjam + "', "
                        + " '" + this.tanggalkembali + "' "
                        + " )";
        this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
    }
    else {
        String SQL = "UPDATE peminjaman SET "
                        + " idanggota = '" + this.getAnggota().getIdanggota() + "', "
                        + " idbuku = '" + this.getBuku().getIdbuku() + "', "
                        + " tanggalpinjam = '" + this.tanggalpinjam + "', "
                        + " tanggalkembali = '" + this.tanggalkembali + "', "
                        + " WHERE peminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
    }
}
