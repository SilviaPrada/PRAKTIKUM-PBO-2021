package silvia.relasiclass.percobaan1;

public class Processor_Silvia {
    private String merk;
    private double cache;
    
    Processor_Silvia(){
    }
    Processor_Silvia(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory  = %2f\n", cache);
    }
}
