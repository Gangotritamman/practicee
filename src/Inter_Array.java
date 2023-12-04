
public class Inter_Array 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[3];
		ar[0]=2;
		ar[1]=10;
		ar[2]=30;
		System.out.println(ar.length);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	System.out.println("===========");
	//        3-1=2       2>=0  2--   =30;
	//         1          1>=0   1--   =10
	//          0           0>=0  
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
				
				
		
		
	}

}
