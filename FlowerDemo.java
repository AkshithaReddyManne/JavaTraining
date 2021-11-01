import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlowerDemo {
   public void displayflower(String st)
   {
	   
	   
	   if(st.equals("ASIA"))
	   {
		   Map<String,String> s=new HashMap<String,String>();
		   s.put("INDIA","LOTUS");
		   s.put("PAKISTAN","JASMINE");
		   s.put("NEPAL","LALI");
		   for(Map.Entry<String,String>entry:s.entrySet())
		   {
			   System.out.println(entry.getKey()+" "+entry.getValue());
		   }
				   
	   }
	   if(st.equals("AFRICA"))
	   {
		   Map<String,String> s=new HashMap<String,String>();
		   s.put("EGYPT","BLUELOTUS");
		   s.put("NIGERIA","YELLOWTRUMPET");
		   s.put("KENYA","ORCHID");
		   for(Map.Entry<String,String>entry:s.entrySet())
		   {
			   System.out.println(entry.getKey()+" "+entry.getValue());
		   }
				   
	   }
	   if(st.equals("EUROPE"))
	   {
		   Map<String,String> s=new HashMap<String,String>();
		   s.put("GERMANY","CORNFLOWER");
		   s.put("FRANCE","LILY");
		   s.put("GREECE","MOLLIS");
		   for(Map.Entry<String,String>entry:s.entrySet())
		   {
			   System.out.println(entry.getKey()+" "+entry.getValue());
		   }
				   
	   }
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter continent");
       Scanner sc=new Scanner(System.in);
       String continent=sc.nextLine();
       FlowerDemo f1=new FlowerDemo();
       f1.displayflower(continent);
	}

}
