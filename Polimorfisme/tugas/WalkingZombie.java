public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal(){
        // Penyembuhan ditentukan berdasar level zombie
        if (level == 1) {
            health += health * 0.10; // level 1: health bertambah 10%
        } else if (level == 2) {
            health += health * 0.30; // level 2: health bertambah 30%
        } else if (level == 3) {
            health += health * 0.40; // level 3: health bertambah 40%
        }
    }
    
    public void destroyed(){
        // Setiap kali penghancuran, health berkurang 2%
        health -= health * 0.02;
    }

    public String getZombieInfo(){
        return "Walking Zombie Data = \nHealth = " + health + "\nLevel = " + level;
    }
}