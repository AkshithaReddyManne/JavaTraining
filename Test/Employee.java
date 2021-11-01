import java.util.Scanner;

public class Employee {
   private int Employeeid;
   private String Employeename;
   private int BS,TA;
private double SA;
 private double HRA,NS;
   private int Taxdefault=2500;
   public void CALCULATENETSALARY() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Employeeid");
	    Employeeid=sc.nextInt();
	    System.out.println("Enter Employee Name");
	    Employeename=sc.next();
	   System.out.println("Enter basic salary of employee");
	   BS=sc.nextInt();
	   System.out.println("Enter Transport Allowance of employee");
	   TA=sc.nextInt();
	   if(BS<=10000)
	   {
		   HRA=0.2*BS;
		   SA=0.8*BS;
		   NS=BS+HRA+SA+((TA*BS)/100)-Taxdefault;
		  
	   }
	   
	   else if(BS>10000 && BS<=20000)
	   {
		   HRA=0.25*BS;
		   SA=0.9*BS;
		   NS=BS+HRA+SA+((TA*BS)/100)-Taxdefault;
		  
	   }
	   else 
	   {
		   HRA=0.3*BS;
		   SA=0.95*BS;
		   NS=BS+HRA+SA+((TA*BS)/100)-Taxdefault;
		  
	   }
	   System.out.println("Net Salary of "+Employeename+" with id "+Employeeid+" is "+NS);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.CALCULATENETSALARY();

  
	}

}
