public class Pustakawan {
    private String nama;
    private String idPegawai;

    public Pustakawan(String nama, String idPegawai) {
        this.nama = nama;
        this.idPegawai = idPegawai;
    }

    public String info() {
        return "Nama Pustakawan: " + nama + "\nID Pegawai: " + idPegawai;
    }
}