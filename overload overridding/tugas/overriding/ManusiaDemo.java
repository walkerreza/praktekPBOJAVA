public class ManusiaDemo {
    public static void main(String[] args) {
        System.out.println("=== Testing Method Overriding ===");
        System.out.println();
        
        // Object Manusia biasa
        Manusia m = new Manusia();
        System.out.println("--- Object Manusia ---");
        m.bernafas();
        m.makan();
        
        System.out.println();
        
        // Object Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        System.out.println("--- Object Mahasiswa ---");
        mhs.bernafas();  // Dari parent
        mhs.makan();     // Override
        mhs.lembur();    // Method baru
        
        System.out.println();
        
        // Object Dosen
        Dosen dsn = new Dosen();
        System.out.println("--- Object Dosen ---");
        dsn.bernafas();  // Dari parent
        dsn.makan();     // Override
        dsn.lembur();    // Method baru
        
        System.out.println();
        
        // Dynamic Method Dispatch (Polymorphism)
        System.out.println("--- Dynamic Method Dispatch ---");
        Manusia m1 = new Mahasiswa();
        Manusia m2 = new Dosen();
        
        m1.makan();  // Output: "Mahasiswa makan"
        m2.makan();  // Output: "Dosen makan"
    }
}
