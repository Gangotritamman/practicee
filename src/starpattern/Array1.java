package starpattern;

public class Array1
{
 public static void main(String[] args)
 {
	int [] ar=new int[3];
	ar[0]=30;
	ar[1]=70;
	ar[2]=30;
	
	System.out.println(ar[2]);
	System.out.println(ar.length);
	for(int i=0;i<=ar.length-1;i++)
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
