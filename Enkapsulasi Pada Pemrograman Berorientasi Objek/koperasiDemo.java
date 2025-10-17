public class koperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("iwan", "jalan mawar");
        System.out.println("Simpanan: " + anggota1.getNama() + ": Rp " + anggota1.getSimpanan());

        anggota1.setNama ("iwan setiawan");

        anggota1.setAlamat("jalan sularno hatta no 10");
        anggota1.setor(100000);
        System.out.println("simpanan" + anggota1.getNama() + ": Rp " + anggota1.getSimpanan());

        anggota1.pinjam(50000);
        System.out.println("simpanan" + anggota1.getNama() + ": Rp " + anggota1.getSimpanan());
    }
}

//4