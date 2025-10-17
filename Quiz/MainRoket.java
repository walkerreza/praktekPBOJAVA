public class MainRoket {
    public static void main(String[] args) {
         Roket rkt = new Roket("jet", 9000);
         Generator gnt = new Generator(5000,110);
         SpaceShuttle ss = new SpaceShuttle("Appolo99", 3500, rkt, gnt);
    
    System.out.println("kode Shuttle :" + ss.getKode());
    
    System.out.println("Tipe Roket :" + ss.getRkt().getroketTipe());

    System.out.println("Daya Generator :" + ss.getGnt().getvoltase());
        }
}