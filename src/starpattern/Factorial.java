package starpattern;

public class Factorial 
{
public static void main(String[] args)
{
	int num = 10; //10*9*8*7*6*5*4*3*2*1
	int fact = 1;
	for(int i=num;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	
	
}
}
