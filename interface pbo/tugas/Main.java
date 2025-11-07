public class Main {
    public static void main(String[] args) {
      
        // Membuat objek Keledai (Herbivora)
        Keledai keledai = new Keledai("Keledai", 4, "Hebohehe", "Abu-Abu");
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        System.out.println();
        
        // Membuat objek Gorilla (Omnivora - Karnivora + Herbivora)
        Gorilla gulali = new Gorilla("Gulali", 4, "Haaum Haaum", "Hitam Manis");
        gulali.displayBinatang();
        gulali.displayMakan();
        gulali.displayData();
        System.out.println();
        
        // Membuat objek Singa (Karnivora)
        Singa cingaCing = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
        cingaCing.displayBinatang();
        cingaCing.displayMakan();
        cingaCing.displayData();
        
    }
}
