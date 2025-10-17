public class testTelevisi {
    public static void main (String[] args){

        televisiModern tv = new televisiModern("samsong",100);
        System.out.println("channel aktif :" + tv.getChannelAktif());
        tv.pindahChannel(20);
        System.out.println("channel aktif sekarang:" + tv.getChannelAktif());
        tv.gantiModusTampilan("HDMI");
        tv.mainkanDVD();
        tv.masukkanDVD("the MATRIX");
        tv.mainkanDVD();
    }
}