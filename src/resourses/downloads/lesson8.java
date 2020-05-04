package resourses.downloads;
public class lesson8
{
	public static void main(String[] args)
	{
		System.out.println(average(1,2,3,4,5,6));
	}
	public static int average(int...no)
	{
		int total=0;
		for(int x:no)
			total=total+x;
		System.out.println("your average of "+ no.length +"numbers");
		return total/no.length;
	}
	}