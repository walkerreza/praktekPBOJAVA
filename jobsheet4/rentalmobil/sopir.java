public class sopir {
    private String nama;
    private int biaya;

    public sopir() {
        nama = "";
        biaya = 0;
    }

    public sopir(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {  // Perubahan dari void ke String
        return nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public int getBiaya() {  // Perubahan dari void ke int
        return biaya;   
    }
    
    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}