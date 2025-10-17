public class SpaceShuttle {


private String kode;
private int Brt;
private Roket Rkt;
private Generator Gnt;


public SpaceShuttle(String kode, int Brt, Roket Rkt, Generator Gnt){
    this.kode=kode;
    this.Brt=Brt;
    this.Rkt=Rkt;
    this.Gnt=Gnt;
}

public String getKode(){
    return kode;
}
public void setKode(String kode){
    this.kode=kode;
}
public int getBrt(){
    return Brt;
}
public void setBrt(int Brt){
    this.Brt=Brt;
}
public Roket getRkt(){
    return Rkt;
}
public void setRkt(Roket Rkt){
    this.Rkt=Rkt;
}
public Generator getGnt(){
    return Gnt;
}
public void setGnt(Generator Gnt){
    this.Gnt=Gnt;
}
}
