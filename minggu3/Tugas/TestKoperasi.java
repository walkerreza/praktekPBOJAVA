import java.util.Scanner;

public class TestKoperasi
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);

System.out.println("Masukkan nomor Ktp: ");
String nomorKtp = input.nextLine();

System.out.println("Masukkan nama: ");
String nama = input.nextLine();

System.out.println("Masukkan limit pinjaman: ");
int limitPinjaman = input.nextInt();

Anggota donny = new Anggota(nomorKtp, nama, limitPinjaman);
System.out.println("Nama Anggota: " + donny.getNama());
System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

System.out.print("\nMasukkan jumlah pinjaman pertama: ");
int pinjaman1 = input.nextInt();
System.out.println("Meminjam uang " + pinjaman1 + "...");
donny.pinjam(pinjaman1);
System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

System.out.print("\nMasukkan jumlah pinjaman kedua: ");
int pinjaman2 = input.nextInt();
System.out.println("Meminjam uang " + pinjaman2 + "...");
donny.pinjam(pinjaman2);
System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

System.out.print("\nMasukkan jumlah angsuran pertama: ");
int angsuran1 = input.nextInt();
System.out.println("Membayar angsuran " + angsuran1);
donny.angsur(angsuran1);
System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

System.out.print("\nMasukkan jumlah angsuran kedua: ");
int angsuran2 = input.nextInt();
System.out.println("Membayar angsuran " + angsuran2);
donny.angsur(angsuran2);
System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

input.close();
}
}
