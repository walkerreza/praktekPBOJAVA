import interfacelatihan.IBerprestasi;
import interfacelatihan.Pascasarjana;
import interfacelatihan.Rektor;
import interfacelatihan.SarjanaBerprestasi;

public class MultipleInterfaceMul {

    public static void main (String[] args){
        Rektor pakRektor = new Rektor();
        
        SarjanaBerprestasi sarjanaCumlaude = new SarjanaBerprestasi("Dini");
        Pascasarjana masterCum = new Pascasarjana("Elok");
           pakRektor.beriSertifikatMawapres(sarjanaCumlaude);   
        pakRektor.beriSertifikatMawapres(masterCum);
     
    
    }
}