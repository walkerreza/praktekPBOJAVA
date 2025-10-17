public class televisiModern extends televisi {
    private String modusTampilan;
    private String dvd;

    public televisiModern(String mrk, int jmlChannel) {
        // Mengisi atribut publik yang diwarisi dari class Televisi
        this.merek = mrk;
        this.jumlahChannel = jmlChannel;
    }

    public void gantiModusTampilan(String modus) {
        this.modusTampilan = modus;
    }

    public void mainkanDVD() {
        if (this.dvd !=null){
            System.out.println("sedang memainkan DVD: "+ this.dvd);
        }
        else if (this.dvd == null){
        System.out.println("sedang memainkan DVD: kosong");
    }
}

    public void masukkanDVD(String judulDVD) {
        this.dvd = judulDVD;
    }
}