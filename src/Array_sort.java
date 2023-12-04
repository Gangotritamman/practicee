import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_sort 
{
	public static void main(String[] args)
	{
		String [] ar=new String[4];
		ar[0]="Gangotri";
		ar[1]="savi";
		ar[2]="kavi";
		ar[3]="geeta";
		System.out.println(ar.length);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("-------");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
		
				
		
		
		
	}

}
