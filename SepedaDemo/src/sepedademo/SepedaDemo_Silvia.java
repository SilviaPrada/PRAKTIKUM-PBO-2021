package sepedademo;

public class SepedaDemo_Silvia {
    
    public static void main(String[] args){
        
        Sepeda_Silvia spd1 = new Sepeda_Silvia();
        Sepeda_Silvia spd2 = new Sepeda_Silvia();
        SepedaGunung_Silvia spd3 = new SepedaGunung_Silvia();
        
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakStatus();
    }
}
