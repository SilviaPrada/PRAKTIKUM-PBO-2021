package TugasPraktikum;

public class WalkingZombie extends Zombie{

    public WalkingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        if (level == 1){
            health = health + (health*10/100);
        }else if (level == 2){
            health = health + (health*30/100);
        }if (level == 3){
            health = health + (health*40/100);
        }
    }

    @Override
    public void destroyed() {
        health = health-(health*2/100);
    }
    
    @Override
    public String getZombieInfo(){
        String info = super.getZombieInfo();
        info += "Walking Zombie Data = "+"\n";
        info += "Health = "+ health +"\n";
        info += "Level = "+ level + "\n";
        return info;
    }
}
