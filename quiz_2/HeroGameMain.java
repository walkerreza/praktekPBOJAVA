public class HeroGameMain {
    public static void main(String[] args) {
        Gatotkaca g = new Gatotkaca("Gatots", 99);
        CaptainIndonesia ci = new CaptainIndonesia("Caps", 77);
        Evil e = new Evil();
        Villain v = new Villain();

        g.serang(new Evil());
        ci.serang(new Evil());
        ci.serang(new Villain());
    
    }
}
