package starpattern;

public class methodwithparameter
{
public static void main(String[] args)
 {
	add(50,60);
	add(60,80);
	
	System.out.println("---------------");
	methodwithparameter s9=new methodwithparameter();
	s9.mult(4, 3);
	s9.mult(8, 90);
	
	}
	//method with 2 int(int, int) parameter
	public static void add(int a, int b) //variable declaration // a=100, b=200
	{
	System.out.println(a+b); //100+ 200 = 300
	}
	//method with 2 int(int, int) parameter
	public void mult(int c, int d) //c=8, d=9
	{
	System.out.println(c*d); //8*9= 72
	}


}
