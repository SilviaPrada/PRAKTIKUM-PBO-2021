package silvia.relasiclass.percobaan1;

public class Laptop_Silvia {
    private String merk;
    private Processor_Silvia proc;
    
    Laptop_Silvia(){
    }
    Laptop_Silvia(String merk, Processor_Silvia proc){
        this.merk = merk;
        this.proc = proc;
    }
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProc(Processor_Silvia proc) {
        this.proc = proc;
    }

    public String getMerk() {
        return merk;
    }

    public Processor_Silvia getProc() {
        return proc;
    }
    
}
