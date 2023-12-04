package starpattern;

public class Array
{
public static void main(String[] args)
{
	String[] ar=new String[3];
	ar[0]="gangotri";
	ar[1]="Jyoti";
	ar[2]="Srinivas";
	System.out.println(ar[0]);
	System.out.println(ar.length);
	for(int i=0;i<=ar.length-1;i++)    //original data
	{
		System.out.println(ar[i]);
	}
	System.out.println("--------------");
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
}
}
