public class pelanggan {
    private String nama;
    private mobil mobil;
    private sopir sopir;
    private int hari;

    public pelanggan() {
        this.nama = "";
        this.mobil = new mobil();
        this.sopir = new sopir();
        this.hari = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setMobil(mobil mobil) {
        this.mobil = mobil;
    }
    
    public void setSopir(sopir sopir) {
        this.sopir = sopir;
    }
    
    public void setHari(int hari) {
        this.hari = hari;
    }
    
    public String getNama() {
        return nama;
    }
    
    public mobil getMobil() {
        return mobil;
    }
    
    public sopir getSopir() {
        return sopir;
    }
    
    public int getHari() {
        return hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}