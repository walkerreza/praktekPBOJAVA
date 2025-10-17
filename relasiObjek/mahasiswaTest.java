public class mahasiswaTest {
    public static void main(String[] args) {
 Jurusan jur = new jurusan();
 jur.setNama("teknik informatika")
 jur.setAkreditasi("A");
 
 mahasiswa mhs = new mahasiswa("11111","andi",jur);
 mhs.tampilkanInfo();
 
    }
}