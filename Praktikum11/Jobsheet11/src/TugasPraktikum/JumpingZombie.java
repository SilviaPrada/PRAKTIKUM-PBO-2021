package TugasPraktikum;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }
    
    @Override
    public void heal() {
        if (level == 1){
            health = health + (health*30/100);
        }else if (level == 2){
            health = health + (health*40/100);
        }if (level == 3){
            health = health + (health*50/100);
        }
    }

    @Override
    public void destroyed() {
        health = health-(health*1/100);
    }
    
    @Override
    public String getZombieInfo(){
        String info = super.getZombieInfo();
        info += "Jumping Zombie Data = "+"\n";
        info += "Health = "+ health +"\n";
        info += "Level = "+ level + "\n";
        return info;
    }
}
