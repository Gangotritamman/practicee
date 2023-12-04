import java.util.Arrays;

public class demo_ArrayString
{
	public static void main(String[] args)
	{
		String [] ar =new String[5];
		ar[0]="gangotri";
		ar[1]="abhi";
		ar[2]="Shreeshail";
		ar[3]="srinivas";
		ar[4]="soumya";
		
		System.out.println(ar[4]);
		System.out.println(ar.length);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
