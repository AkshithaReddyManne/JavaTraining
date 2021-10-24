import java.util.Scanner;


public class Switchexample {

	/**
	 * @param args
	 */
	static int add(int a,int b)
	{
		return  a+b;
	}
    static double avg(int a,int b)
    {
    	return (a+b)/2;
    }
    static void evenorodd(int p)
    {
    	if(p%2==0)
    	System.out.println(p+" is even number");
    	else
    		System.out.println(p+" is odd number");
    	}
    static void posorneg(int p)
    {
    	if(p>0)
  		  System.out.println(p+" is positive number");
    	else
    		System.out.println(p+" is negative number");
    }
    static void checkprime(int p)
    {
    	boolean flag=false;
    	for(int i=2;i<=p/2;++i)
    	{
    		if(p%2==0)
    			flag=true;
    		break;
    	}
    	if(!flag)
    		System.out.println(p+" is prime number");
    	else
    		System.out.println(p+" is not a prime number");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n,a,b;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter a");
      
      a=sc.nextInt();
      System.out.println("Enter b");
      
      b=sc.nextInt();
      while(true)
      {
    	  System.out.println("enter 1 for adding");
    	  System.out.println("enter 2 fpr average");
    	  System.out.println("enter 3 for even/odd");
    	  System.out.println("enter 4 for positive/negative");
    	  System.out.println("enter 5 for prime or not");
    	  System.out.println("enter 6 for quit");
    	  System.out.println("enter n");
    	  n=sc.nextInt();
      switch(n)
      {
      case 1:
    	  System.out.println("Addition of two numbers is"+add(a,b));
    	  break;
      case 2:
    	  int avg=(a+b)/2;
    	  System.out.println("Average of two numbers is"+avg(a,b));
    	  break;
      case 3:
    	  evenorodd(a);
    	  break;
      case 4:
    	  posorneg(a);
    	  break;
      case 5:
    	  checkprime(a);
    	  break;
      case 6:
    	  System.exit(0);
      }
      
      }
     
	}
}