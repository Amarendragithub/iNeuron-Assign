
class Programming {

	
	public void m1()
	{
	System.out.println("Programming");
	}
}
class DP extends Programming {

	
	public void m2()
	{
	System.out.println("DP");
	}
}
public class Assignment2 {

	public static void main(String[] args)
	{
	
		DP obj = new DP();
		obj.m2();
		obj.m1();
	}
}
