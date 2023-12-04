package starpattern;

public class Reverse_palidram 
{
public static void main(String[] args)
{
	String org = "refer";
	String rev = "";
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	if(rev.equals(org))
	{
		System.out.println("given string is palidram");
	}
	else
	{
		System.out.println("giver string not palidram");
	}
}

}
