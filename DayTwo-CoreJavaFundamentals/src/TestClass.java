
import java.util.Scanner;
public class TestClass {
    
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<2 ; i++ ) {

            System.out.print("Enter Name : ");
            String name = scan.nextLine(); 
            System.out.print("Enter Code : ");
            int code = scan.nextInt();
            System.out.print("Enter Salary : ");
            float salary = scan.nextFloat();
            System.out.print("Enter Project Code : ");
        
            long projectCode = scan.nextLong();
            
            System.out.println("Employee Name : " + name);
            System.out.println("Employee Code : " + code);
            System.out.println("Employee Salary : " + salary);
            System.out.println("Project Code : " + projectCode);
            scan.nextLine();
    
        }
        
    }
}
