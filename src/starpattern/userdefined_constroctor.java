package starpattern;

public class userdefined_constroctor
{
int num1;   //50
int num2;   //60
userdefined_constroctor()
{
	num1=50;
	num2=60;	
}
public void add()
{
	System.out.println(num1+num2);
}
public void mult()
{
	System.out.println(num1*num2);
}
public static void main(String[] args)
{
	userdefined_constroctor uc=new userdefined_constroctor();
	uc.add();
	uc.mult();
	
}

}
