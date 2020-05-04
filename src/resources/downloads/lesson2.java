
//Adding a new comment
// Adding a comment
package resources.downloads;

import java.util.Scanner;


public class lesson2
{
	static Scanner userinput=new Scanner(System.in);
	public static void main(String[] args)
	{
System.out.print("your favourite number :");
if(userinput.hasNextInt())
{
	int numberentered=userinput.nextInt();
	System.out.println("you entered " + numberentered);
	int numberenteredtimes2=numberentered+numberentered;
	System.out.println(numberentered +" + " + numberentered  +  " = " +numberenteredtimes2);
	
	int no=Math.abs(numberentered);
	System.out.println(no);
	int bigger=Math.max(5,7);
	System.out.println(bigger);
	int minimum=Math.min(5,7);
	System.out.println(minimum);
	double square=Math.sqrt(numberentered);
	System.out.println(square);
	int num=(int)Math.ceil(5.23);
	System.out.println(num);
	int n=(int)Math.floor(5.6);
	System.out.println(n);
	int random=(int)(Math.random()*numberentered);
	System.out.println(random);
	}else
	{
		System.out.println("enter an integet next time");
	}
}
	}
