public class Tester2{
    public static void main(String[] args) {
 
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employee e;
        Payable p;
        e = pEmp;
        p = pEmp;

        System.out.println(""+e.getEmployeeInfo());

        System.out.println("-----------------");

        System.out.println("" + pEmp.getEmployeeInfo());


    }
}