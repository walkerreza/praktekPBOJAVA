public class mainpercobaan2 {
    public static void main(String[] args) {
        mobil m = new mobil();  // Ganti Mobil -> mobil
        m.setNama("Avanza");
        m.setBiaya(350000);
        sopir s = new sopir();  // Ganti Sopir -> sopir
        s.setNama("John Doe");
        s.setBiaya(200000);
        pelanggan p = new pelanggan();  // Ganti Pelanggan -> pelanggan
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotal());
        System.out.println(p.getMobil().getNama());
    }
}