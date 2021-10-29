import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList3 {
    int sum(ArrayList<Integer> a)
    {
    	int sum=0;
    	for(int i:a)
    	{
    		sum=sum+i;
    	}
    	return sum;
    }
    double mean(ArrayList<Integer> a)
    		{
    	int sum=0;
    	for(int i:a)
    	{
    		sum=sum+i;
    	}
    	return sum/(a.size());
    		}
    void median(ArrayList<Integer> a)
    {
    	int m,n;
    	Collections.sort(a);
    	n=a.size();
    	
    	if(n%2==1)
    	{
    		m=a.get(((n+1)/2)-1);
    		
    	}
    	else
    	{
    		
    		m=a.get((n-2)/2+a.get(n/2))/2;
    	}
    	System.out.println("Meadian is "+m);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a =new ArrayList<Integer>();
		System.out.println("Enter size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int p=sc.nextInt();
			a.add(p);
		}
		System.out.println(a);
		ArrayList3 s= new ArrayList3();
		System.out.println("Sum is "+s.sum(a));
		System.out.println("Mean is "+s.mean(a));
		s.median(a);
		
	}

}
