public class processor {

    private String merk;
    private double cache;


    public processor() {
     this.merk = "";
     this.cache = 0;
    }


    public processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public String getMerk() {
    
        return merk;
    }

    public double getCache() {
    
        return cache;
        
    }

    public void setMerk(String merk) {
    
    this.merk = merk;
    }

    public void setCache(double cache){
        this.cache = cache;
    }

    public void info() {
        System.out.printf("merk processor = %s\n", merk);
        System.out.printf("cache processor = %.2f\n", cache);
    }

}