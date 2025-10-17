public class Peminjaman {
    private Buku buku;
    private Mahasiswa mahasiswa;
    private Pustakawan pustakawan;
    private int hari;

    public Peminjaman(Buku buku, Mahasiswa mahasiswa, Pustakawan pustakawan, int hari) {
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.pustakawan = pustakawan;
        this.hari = hari;
    }

    public int hitungDenda() {
        int batas = 7; // batas hari peminjaman
        int dendaPerHari = 1000;
        if (hari > batas) {
            return (hari - batas) * dendaPerHari;
        }
        return 0;
    }

    public String info() {
        String info = "=== Data Peminjaman ===\n";
        info += mahasiswa.info() + "\n";
        info += buku.info() + "\n";
        info += pustakawan.info() + "\n";
        info += "Jumlah Hari: " + hari + "\n";
        info += "Denda: Rp " + hitungDenda() + "\n";
        return info;
    }
}