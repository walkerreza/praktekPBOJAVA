public class televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    
    public televisi() {
        this.channelAktif = 1;
    }

    public void pindahChannel(int channelBaru) {
        this.channelAktif = channelBaru;
    }

    public int getChannelAktif() {
        
        return channelAktif;
    }
}