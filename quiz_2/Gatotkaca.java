public class Gatotkaca extends Hero {
    public int speed;

    public Gatotkaca(String nama, int speed) {
        super(nama);
        this.speed = speed;
    }

    @Override
    public void serang(KillAble ka) {
        super.serang(ka);
    }
}