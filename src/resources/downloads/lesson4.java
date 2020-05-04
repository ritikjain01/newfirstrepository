package resources.downloads;
import java.util.Scanner;

public class lesson4
{
	static Scanner abc=new Scanner(System.in);
public static void main(String[]args)
	{
	int i=1;
	while(i<=20)
	{
		if(i%2==0)
		{
			i=i+1;
			continue;
		}
		if(i>10)
			break;
System.out.println(i);
i++;
	}
	double pi=4.0;
	double j=3;
	while(j<8000)
	{
		pi=pi-(4/j)+(4/(j+2));
		j=j+4;
		System.out.println(pi);		
	}
	int h=1;
	String out="y";
	while(out.equalsIgnoreCase("y"))
	{
		System.out.println(h);
		System.out.println("to continue press y");
		out=abc.nextLine();
		h++;
	}
	int k=10;
	do
	{
		System.out.println(k);
		k++;
	}
	while(k<10);
	}
	}
