import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample10
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("Please Input an Integer");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		int num = Integer.parseInt(str1);
		System.out.println("The number inputted is "+num);
		System.out.println("Please input a string");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		System.out.println("The string inputted is "+str2);
	}

}
