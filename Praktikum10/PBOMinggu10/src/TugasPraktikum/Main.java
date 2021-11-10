package TugasPraktikum;

public class Main {
    public static void main(String[] args) {
        
        Singa singa = new Singa("Singa", 4, "Mengaum", "Coklat");
        Keledai keledai = new Keledai("Keledai", 4, "Meringkik", "Abu-Abu");
        Gorilla gorila = new Gorilla("Gorila", 2, "Menggaung", "Hitam");
        
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
        
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        
        gorila.displayBinatang();
        gorila.displayMakan();
        gorila.displayData();
    }
}
