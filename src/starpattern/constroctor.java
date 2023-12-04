package starpattern;

public class constroctor 
{
	constroctor()
	{
		
	}
public  void m1()
{
	System.out.println("running method m1");
}
public void m2()
{
	System.out.println("running method m2");
}
public static void main(String[] args)
{
	constroctor c=new constroctor();
	c.m1();
	c.m2();
	constroctor1 c2=new constroctor1();
	c2.m3();
	c2.m4();
}
}
