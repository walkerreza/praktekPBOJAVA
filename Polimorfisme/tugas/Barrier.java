public class Barrier implements Destroyable {
 
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return strength;   
    }

    public void destroyed(){
        // Setiap kali destroyed, strength berkurang 1
        strength -= 1;
    }
    
    public String getBarrierInfo(){
        return "Barrier Strength = " + strength;
    }   

}