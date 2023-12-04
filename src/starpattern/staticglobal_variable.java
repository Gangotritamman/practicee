package starpattern;

public class staticglobal_variable 
{
	int a;
	
	public static void m1()
	{
		int b;
		System.out.println(a);
		System.out.println(b);
	}
	public void m2()
	{
		int c;
		
		System.out.println(c);
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		
	}

}
