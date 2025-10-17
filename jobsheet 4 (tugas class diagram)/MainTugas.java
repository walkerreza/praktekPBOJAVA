public class mainTugas {
    public static void main(String[] args) {
        Buku b1 = new Buku("Pemrograman Java", "Budi Santoso", 2022);
        Mahasiswa m1 = new Mahasiswa("abah", "10123022");
        Pustakawan p1 = new Pustakawan("Ani", "PG001");

        Peminjaman peminjaman = new Peminjaman(b1, m1, p1, 10);
        System.out.println(peminjaman.info());
    }
}