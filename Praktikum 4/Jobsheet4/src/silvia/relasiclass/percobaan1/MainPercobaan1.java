package silvia.relasiclass.percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args){
        Processor_Silvia p = new Processor_Silvia("Intel i5", 3);
        Laptop_Silvia L = new Laptop_Silvia("Thinkpad", new Processor_Silvia("Intel i5", 3));
        
        L.info();
        
        Processor_Silvia p1 = new Processor_Silvia();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop_Silvia L1 = new Laptop_Silvia();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
    
}
