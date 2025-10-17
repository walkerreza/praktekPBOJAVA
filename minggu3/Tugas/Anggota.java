public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    
    // Konstruktor
    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; // awal pinjaman 0
    }
    
    // Getter methods
    public String getNomorKTP() {
        return nomorKTP;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getLimitPinjaman() {
        return limitPinjaman;
    }
    
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
    
    // Method untuk meminjam uang
    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah <= limitPinjaman) {
            jumlahPinjaman += jumlah;
            System.out.println("Pinjaman berhasil. Jumlah pinjaman sekarang: " + jumlahPinjaman);
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }
    
    // Method untuk mengangsur pinjaman
    public void angsur(int jumlah) {
        if (jumlah <= jumlahPinjaman) {
            jumlahPinjaman -= jumlah;
            System.out.println("Terima kasih, angsuran Anda diterima.");
        } else {
            System.out.println("Maaf, angsuran tidak boleh melebihi jumlah pinjaman.");
        }
    }
}