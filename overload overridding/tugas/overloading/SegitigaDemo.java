public class SegitigaDemo {
    public static void main(String[] args) {
        segitiga sg = new segitiga();
        
        System.out.println("=== Testing Method Overloading ===");
        System.out.println();
        
        // Testing totalSudut dengan 1 parameter
        int sudut1 = sg.totalSudut(90);
        System.out.println("Total sudut (1 parameter): " + sudut1);
        
        // Testing totalSudut dengan 2 parameter
        int sudut2 = sg.totalSudut(60, 70);
        System.out.println("Total sudut (2 parameter): " + sudut2);
        
        System.out.println();
        
        // Testing keliling dengan 3 parameter (int)
        int keliling1 = sg.keliling(3, 4, 5);
        System.out.println("Keliling (3 sisi): " + keliling1);
        
        // Testing keliling dengan 2 parameter (double)
        double keliling2 = sg.keliling(3, 4);
        System.out.println("Keliling (2 sisi, pythagoras): " + keliling2);
    }
}
