public class Apel extends Buah {

    public Apel() {
        Rasa = " manis agak asem";
        this.kandungaAir = 70;
    }

    public void TampilkanBiji(){
        System.out.println("biji apel berukuran kecil");
    }
    public void TampilkanAir(){
        System.out.println("Apel mengandung " + kandungaAir + " air");
    }
}