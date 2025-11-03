// Abstract class Hewan (sudah ada)
abstract class Hewan {
    private int umur;
    
    protected Hewan() {
        this.umur = 0;
    }
    
    public void bertambahUmur() {
        this.umur += 1;
    }
    
    // Method abstract yang WAJIB diimplementasikan
    public abstract void bergerak();
}

// BUKTI 1: Class yang BENAR - mengimplementasikan method abstract
class Kucing extends Hewan {
    @Override
    public void bergerak() {
        System.out.println("Kucing berjalan dengan kaki: Tap..Tap..");
    }
}

class Ikan extends Hewan {
    @Override
    public void bergerak() {
        System.out.println("Ikan berenang dengan sirip: Wush..Wush..");
    }
}

// BUKTI 2: Class yang SALAH - tidak mengimplementasikan method abstract
// (Uncomment untuk melihat error)
/*
class Burung extends Hewan {
    // ERROR: Burung is not abstract and does not override abstract method bergerak() in Hewan
    public void makan() {
        System.out.println("Burung makan biji-bijian");
    }
}
*/

// BUKTI 3: Abstract class yang extend abstract class - TIDAK WAJIB implement
abstract class HewanDarat extends Hewan {
    // Tidak wajib mengimplementasikan bergerak() karena class ini juga abstract
    public abstract void berlari();
    
    public void tidur() {
        System.out.println("Hewan darat sedang tidur");
    }
}

// BUKTI 4: Class concrete yang extend abstract class bertingkat
class Anjing extends HewanDarat {
    // WAJIB implement SEMUA method abstract
    @Override
    public void bergerak() {
        System.out.println("Anjing berjalan dengan 4 kaki");
    }
    
    @Override
    public void berlari() {
        System.out.println("Anjing berlari dengan cepat");
    }
}

public class BuktiAbstract {
    public static void main(String[] args) {
        System.out.println("=== BUKTI ATURAN ABSTRACT CLASS ===\n");
        
        // Test class yang benar
        Kucing kucing = new Kucing();
        Ikan ikan = new Ikan();
        Anjing anjing = new Anjing();
        
        System.out.println("1. KUCING (Class concrete - WAJIB implement bergerak()):");
        kucing.bergerak();
        kucing.bertambahUmur();
        
        System.out.println("\n2. IKAN (Class concrete - WAJIB implement bergerak()):");
        ikan.bergerak();
        ikan.bertambahUmur();
        
        System.out.println("\n3. ANJING (Class concrete - WAJIB implement SEMUA method abstract):");
        anjing.bergerak();
        anjing.berlari();
        anjing.tidur();
        
        System.out.println("\n=== KESIMPULAN BUKTI ===");
        System.out.println("✓ Kucing & Ikan: Berhasil karena mengimplementasikan bergerak()");
        System.out.println("✓ HewanDarat (abstract): Tidak wajib implement bergerak()");
        System.out.println("✓ Anjing: Wajib implement bergerak() DAN berlari()");
        System.out.println("✗ Class Burung (dalam komentar): AKAN ERROR jika tidak implement bergerak()");
        
        // Tidak bisa membuat objek dari abstract class
        // Hewan hewan = new Hewan(); // ERROR!
        // HewanDarat hewanDarat = new HewanDarat(); // ERROR!
    }
}
