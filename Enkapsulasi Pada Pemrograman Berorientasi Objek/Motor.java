public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0; 
    }
    public void tambahKecepatan(){
        if (kontakOn == true){
            kecepatan+=5;
        }
        else {
            System.out.println("kecepatan tidak bisa bertambah karena mesin mati");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn == true){
            kecepatan-=5;
        }
        else {
            System.out.println("kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }
    public void printstatus(){
        if (kontakOn == true){
            System.out.println("kontak on");
        }
        else {
            System.out.println("kontak off");
        }
        System.out.println("kecepatan" + kecepatan + "\n");
    }
}