package starpattern;

public class ReverseString
{
public static void main(String[] args)
{
	String org = "abc";
	String rev = "";
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	System.out.println("Reverse String :"+rev);
	
}
}
