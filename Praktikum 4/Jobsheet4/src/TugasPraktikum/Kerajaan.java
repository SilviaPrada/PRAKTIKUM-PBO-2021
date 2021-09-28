package TugasPraktikum;

public class Kerajaan {
    private String namaKerajaan;
    private RajaCheoljong raja;

    public Kerajaan(String namaKerajaan, RajaCheoljong raja) {
        this.namaKerajaan = namaKerajaan;
        this.raja = raja;
    }

    public String getNamaKerajaan() {
        return namaKerajaan;
    }

    public void setNamaKerajaan(String namaKerajaan) {
        this.namaKerajaan = namaKerajaan;
    }

    public RajaCheoljong getRaja() {
        return raja;
    }

    public void setRaja(RajaCheoljong raja) {
        this.raja = raja;
    }
}
