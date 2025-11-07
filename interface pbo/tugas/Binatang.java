public abstract class Binatang {
    protected String nama;
    protected int jumlahKaki;
    
    public Binatang(String nama, int jumlahKaki) {
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
    
    public int getKaki() {
        return this.jumlahKaki;
    }
    
    public abstract void displayMakan();
    public abstract void displayBinatang();
    public abstract void displayData();
}
