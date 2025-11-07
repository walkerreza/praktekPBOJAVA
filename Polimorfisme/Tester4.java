public class Tester4 {
    public static void main(String[] args) {
        Owner owner = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        owner.pay(eBill); // pay for electricity bill
        System.out.println("----------------------------------------");
        
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        owner.pay(pEmp); // pay for permanent employee
        System.out.println("----------------------------------------");
        
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        owner.showMyEmployee(pEmp); // show permanent employee info
        System.out.println("----------------------------------------");
        owner.showMyEmployee(iEmp); // show internship employee info
 
 
        // owner.pay(iEmp);
    }
}