

public class testAkademik {
    public static void main(String[] args) {
 
        // 1. Buat objek untuk menampung daftar gaji
        DaftarGaji daftarGaji = new DaftarGaji(5);

        // 2. Buat objek pegawai dan dosen
        Pegawai pegawai1 = new Pegawai("67890", "Andi", "Surabaya");
        Dosen dosen1 = new Dosen("12345", "Dr. Budi", "Bandung");
        dosen1.setSKS(6);

        // 3. Tambahkan semua pegawai ke dalam daftar
        daftarGaji.addPegawai(pegawai1);
        daftarGaji.addPegawai(dosen1);

        // 4. Tampilkan seluruh daftar gaji
        daftarGaji.printSemuaGaji();
    }
}