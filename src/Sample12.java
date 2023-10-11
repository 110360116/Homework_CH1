
public class Sample12
{
	public static void main(String[] args)
	{
		int num1 = 23;
		int num2 = 13;
		System.out.println("Operations of num1 and num2:");
		System.out.println("num1+num2 equals "+(num1+num2));
		System.out.println("num1-num2 equals "+(num1-num2));
		System.out.println("num1*num2 equals "+(num1*num2));
		System.out.println("num/num2 equals "+(num1/num2));
		System.out.println("num1%num2 equals "+(num1%num2));
		
		int a = 11;
		int b = 9;
		int c = 7;
		
		b = a++;
		c = ++a;
		
		System.out.println("a++ returns the value of a before incrementing, b is "+b);
		System.out.println("++a returns the value of a after it has been incremented, c is "+c);
	}

}
