public class CaptainIndonesia extends Hero {
    public int level;

    public CaptainIndonesia(String nama, int level) {
        super(nama);
        this.level = level;
    }

    @Override
    public void serang(KillAble ka) {
        super.serang(ka);
    }
}