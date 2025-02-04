import java.lang.*;
import java.util.*;

class MyFirst
{
	
	public static void main(String args[])
	{
		System.out.println("Hello World");
		System.out.print("Enter your name:");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		System.out.println("Enter your name:"+name);
	}

}