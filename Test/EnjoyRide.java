import java.util.Scanner;

public class EnjoyRide {
public void calculate(int a,int c,int r,int h)
{
	int adultprice = 0;
	int childprice = 0;
	double price;
	if(r==1)
	{
		adultprice=50;
		childprice=40;
	}
	if(r==2)
	{
		adultprice=60;
		childprice=30;
	}
	 if(r==3)
	{
		adultprice=45;
		childprice=25;
	}
	 if(r==4)
	{
		adultprice=70;
		childprice=60;
	}
	price=((adultprice*a)+(childprice*c))*h;
	System.out.println("Adult ride fare is:"+(adultprice*a)*h);
	System.out.println("Child ride fare is:"+(childprice*c)*h);
	System.out.println("Total Price:"+price);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("How many adults are there?");
       int a=sc.nextInt();
       System.out.println("How many children are there?");
       int c=sc.nextInt();
       System.out.println("Which ride you want to take?  Rides available are 1.Alibaba 2.Alpine slide 3.Bumper Cars 4.Baloon Race");
       int ride=sc.nextInt();
       System.out.println("How many hours you want to take a ride?");
       int h=sc.nextInt();
       System.out.println("Total hours of ride:"+h);
      EnjoyRide e1= new EnjoyRide();
      e1.calculate(a, c, ride, h);
       
	}

}
