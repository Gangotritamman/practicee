package starpattern;

public class methods
{
public static void main(String[] args)
{
	m1();   //call from same class
	
	methods m=new methods();// non static method call fro  same class
	m.m3();
	
	methods1.m2();    //static method call fro  diff class
	
	methods1 d=new methods1();  //non static method call fro  diff class
	d.m4();
}
public static void m1()
{
	System.out.println("Running static method from same class");
}
public void m3()
{
	System.out.println("running non static method ffro  same classS");
}
}
