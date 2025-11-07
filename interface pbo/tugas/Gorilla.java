public class Gorilla extends Binatang implements IKarnivora, IHerbivora {
    private String suara;
    private String warnaBulu;
    
    public Gorilla(String nama, int jumlahKaki, String suara, String warnaBulu) {
        super(nama, jumlahKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayMakan() {
        System.out.println("Makanan: Daging + Tumbuhan");
    }
    
    @Override
    public void displayBinatang() {
        System.out.println("Jenis: Karnivora + Herbivora");
    }
    
    @Override
    public void displayData() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah Kaki: " + this.jumlahKaki);
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
    }
}
