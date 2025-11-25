public class Hero {
    public String nama;

    public Hero(String nama) {
        this.nama = nama;
    }

    public void serang(KillAble ka) {
        ka.dead();
        System.out.println(" Oleh " + nama);
    }
}