public class Pisang extends Buah {
    public Pisang() {
        Rasa = "sepet";
        this.kandungaAir = 100;
    }

    public void TampilkanKulit() {
        System.out.println("kulit pisang berwrna kuning");    
    }
    public void TampilkanAir(){
        System.out.println("pisang mengandung " + kandungaAir + " air");
    }

    
}