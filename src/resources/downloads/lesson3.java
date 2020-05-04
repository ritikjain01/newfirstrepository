package resources.downloads;

public class lesson3
{
	public static void main(String[] args)
	{
int randomno=(int)(Math.random()*50);
if (( randomno < 25))
{
System.out.println("the no is less no 25");

}
System.out.println("randomno="+randomno);
if(!(false) ^ (false))
{
System.out.println("one is true one is false ");
}
int value1=40;
int value2=80;
int biggestvalue=(value1>value2)?value1:value2;
System.out.println("biggest value is "+biggestvalue);
char grade='f';
switch(grade)
{
case 'a':
	System.out.println("excellent");
	break;
case 'b':
	System.out.println("great job");
	break;
case 'c':
	System.out.println("average");
	break;
case 'e':
	System.out.println("require improvement=");
	break;
default :
	System.out.println("failed=");
	break;
}
	
}

	}
	