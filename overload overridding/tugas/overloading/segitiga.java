public class segitiga {

    private int sudut; 

    public int totalSudut(int sudutA) {
        this.sudut = 180 - sudutA;
        return this.sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        this.sudut = 180 - (sudutA + sudutB);
        return this.sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

   
    public double keliling(int a, int b) {
        double c = Math.sqrt((a * a) + (b * b));
        return a + b + c;
    }
}