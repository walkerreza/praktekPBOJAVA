

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawaiSaatIni;

    public DaftarGaji(int kapasitas) {
        this.listPegawai = new Pegawai[kapasitas];
        this.jumlahPegawaiSaatIni = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (jumlahPegawaiSaatIni < listPegawai.length) {
            listPegawai[jumlahPegawaiSaatIni] = pegawai;
            jumlahPegawaiSaatIni++;
        }
    }

    public void printSemuaGaji() {
        System.out.println("===== Daftar Gaji Pegawai =====");
        for (int i = 0; i < jumlahPegawaiSaatIni; i++) {
            Pegawai pegawai = listPegawai[i];
            System.out.println("Nama   : " + pegawai.getNama());
            System.out.println("Gaji   : Rp " + pegawai.getGaji());
            System.out.println("---------------------------------");
        }
    }
}
