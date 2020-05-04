package resourses.downloads;
public class lesson7
{
	public static void main(String[] args)
	{
		int a[][]= {{1,2,3,4},{5,6,7,8}};
		int b[][]= {{2,4,6,8},{10,12,14,16}};
		System.out.println("your first array is ");
			display(a);
			System.out.println("your second array is ");
			display(b);
	}
	public static void display(int x[][])
	{
		for(int r=0;r<x.length;r++)
		{
			for(int c=0;c<x[r].length;c++)
			{
				System.out.print(x[r][c] +"\t");
			}
			System.out.println();
		}
	}
	}
