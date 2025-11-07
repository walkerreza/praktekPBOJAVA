public class Durian extends Buah {
  
    public Durian() {
        Rasa = "manis legit";
        this.kandungaAir = 80;
    }
    public void TampilkanDurian(){
        System.out.println("Durian mempunyai Duri");
    }
     public void TampilkanAir(){
        System.out.println("Durian mengandung " + kandungaAir + " air");
    }
}