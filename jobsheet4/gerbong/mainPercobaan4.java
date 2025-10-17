public class mainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p1 = new Penumpang("12345", "budi");
        Penumpang p2 = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p1, 2);
        gerbong.setPenumpang(p2, 2);
        System.out.println(gerbong.info());  
        // System.out.println(gerbong.getArrayKursi()[0].Alert());
    }
}