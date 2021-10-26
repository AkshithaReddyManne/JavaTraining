package Inh;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese c= new Chinese();
		Mexican m=new Mexican();
		Italian i =new Italian();
		c.useIngredients();
		m.useVegetables();
		i.useIngredients();
		i.servesPasta();

	}

}
