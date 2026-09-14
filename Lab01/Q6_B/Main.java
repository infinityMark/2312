public class Main{

	public static void main(String [] args) 
	{	
		Customer c1, c2;
		Shop s1;
        Group g1;
		
		c1 = new Customer(200);
		c2 = new Customer(200);
		s1 = new Shop();
        g1 = new Group(new Customer[]{c1,c2});

		s1.earn(g1, 300); //s1 earns and get $30 from c1
		s1.earn(c1, 30);

		System.out.println(s1.getProfit()); 
        System.out.println(c1.getAmount()); 
	}
}