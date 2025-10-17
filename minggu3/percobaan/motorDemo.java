public class motorDemo {
    public static void main(String[] args) {
      Motor motor = new Motor();
      motor.printstatus();
      motor.tambahKecepatan();

      motor.nyalakanMesin();
      motor.printstatus();

      motor.tambahKecepatan();
      motor.printstatus();


      motor.tambahKecepatan();
      motor.printstatus();

      motor.tambahKecepatan();
      motor.printstatus();
      
      motor.matikanMesin();
      motor.printstatus();
    }
}