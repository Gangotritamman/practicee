package starpattern;

public class swap2number_withusing_3rdvariable
{
private static final String temp = null;

public static void main(String[] args)
{
	int num1 = 10;  //30  
	int num2 = 20;   //10
	
	System.out.println("original data");
	System.out.println("first number:"+num1);
	System.out.println("second number:"+num2);
	
	num1=num1+num2;    //30
	num2=num1-num2;   //10   30-20=10
	num1=num1+num2;   //
	
	
	
	System.out.println("");
	
	System.out.println("first number:"+num1);
	System.out.println("second number:"+num2);
	
	
	
	
	
	
}
}
