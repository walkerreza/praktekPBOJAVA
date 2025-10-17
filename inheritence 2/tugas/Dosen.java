

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private final int TARIF_SKS = 120000; 

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.jumlahSKS = 0; 
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji() {
        return super.getGaji() + (this.jumlahSKS * this.TARIF_SKS);
    }
}
