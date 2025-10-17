public class testperbankan {
    public static void main(String[] args) {
   Nasabah nsb1 = new Nasabah();
   Nasabah nsb2 = new Nasabah();
   nsb1.nama = "Bill gates";
   nsb1.saldo = 1000;

   nsb2.nama = "Ridwan Rimanto";
   nsb2.saldo = 2000;

   nsb1.tampilkanSaldo("IDR");
   nsb2.tampilkanSaldo("IDR");
    }

}