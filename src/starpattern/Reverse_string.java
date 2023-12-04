package starpattern;

public class Reverse_string
{
public static void main(String[] args)
{
	String org = "refer";
	String rev = "";	
	
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);	
	}
	System.out.println("reverse string: "+rev);
	if(org.equals(rev))
	{
		System.out.println("given strig is palindram");
	}
	else
	{
		System.out.println("given string is not palindram");
	}
	
}
}
