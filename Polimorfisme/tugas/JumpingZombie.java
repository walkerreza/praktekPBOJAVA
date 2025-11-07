public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal(){
        // Penyembuhan ditentukan berdasar level zombie
        if (level == 1) {
            health += health * 0.30; // level 1: health bertambah 30%
        } else if (level == 2) {
            health += health * 0.40; // level 2: health bertambah 40%
        } else if (level == 3) {
            health += health * 0.50; // level 3: health bertambah 50%
        }
    }

    public void destroyed(){
        // Setiap kali penghancuran, health berkurang 1%
        health -= health * 0.01;
    }

    public String getZombieInfo(){
        return "Jumping Zombie Data = \nHealth = " + health + "\nLevel = " + level;
    }
}