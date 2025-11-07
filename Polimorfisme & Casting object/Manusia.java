public class Manusia 
{
    public void MakanBuah(Buah x)
    {
        if (x instanceof Apel)
        {
            System.out.println("Apel langsung makan");
            ((Apel)x).TampilkanBiji();
            ((Apel)x).TampilkanAir();
        }
        else if (x instanceof Pisang) 
        {
            System.out.println("pisang dikupas terlebih dahulu");
            ((Pisang)x).TampilkanKulit();
            ((Pisang)x).TampilkanAir();
        }
        else if (x instanceof Durian) 
        {
            System.out.println("durian dibelah terlebih dahulu");
            ((Durian)x).TampilkanDurian();
            ((Durian)x).TampilkanAir();
        }
        System.out.println("Rasanya " + x.Rasa);
    }
}