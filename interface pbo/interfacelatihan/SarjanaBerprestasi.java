package interfacelatihan;

public class SarjanaBerprestasi extends Mahasiswa implements ICumlaude, IBerprestasi {
    
    public SarjanaBerprestasi(String nama) {
        super(nama);
    }
    
    // Method dari ICumlaude
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }
    
    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
    
    @Override
    public void kuliahDiKampus() {
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
    
    // Method dari IBerprestasi - NASIONAL
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }
    
    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}
