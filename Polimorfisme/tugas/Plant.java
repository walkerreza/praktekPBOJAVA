public class Plant {
 
    public void doDestroy(Destroyable d) {
        // Memanggil method destroyed() dari objek yang implements Destroyable
        d.destroyed();
    }
    
    public String getPlantInfo(){
        return "Plant";
    }
}