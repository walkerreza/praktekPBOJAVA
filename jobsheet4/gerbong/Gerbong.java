public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
        }
        

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
public void setkode(String kode) {
    this.kode = kode;
}
public String getkode() {
    return kode;
}
public void setPenumpang(Penumpang penumpang, int nomor) {
    if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
        System.out.println("Kursi nomor " + nomor + " sudah terisi.");
    } else {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
    }
     

public Kursi[] getArrayKursi() {
    return arrayKursi;
}

public String info() {
    String info = "";
    info += "Kode: " + kode + "\n";
    for (Kursi kursi : arrayKursi) {
    info += kursi.info();
    }
    return info;
    }
}    
