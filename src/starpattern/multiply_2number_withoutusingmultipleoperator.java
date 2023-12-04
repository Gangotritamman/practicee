package starpattern;

public class multiply_2number_withoutusingmultipleoperator
{
public static void main(String[] args)
{
	int a=5;
	int b=6;
	int sum=0;   //6  12
	          //2<=5
	          //1<=5
	for(int i=1;i<=a;i++) //2  3 4 5 6
	{
		sum=sum+b;   //6  // 12 18 24 30
	}
	System.out.println(sum);
}
}
