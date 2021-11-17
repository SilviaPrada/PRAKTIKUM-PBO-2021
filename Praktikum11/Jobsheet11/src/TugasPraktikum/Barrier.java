package TugasPraktikum;

public class Barrier implements Destroyable{
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
   
    @Override
    public void destroyed() {
        strength = strength-(strength*10/100);
    }   
    
    public String getBarrierInfo(){
        return "Barrier Strength = " + strength;
    }
}
