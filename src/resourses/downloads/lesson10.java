package resourses.downloads;
public class lesson10
{
	private int hour,min,second;
	public lesson10() {
		this(0,0,0);
	}
	public lesson10(int h)
	{
		this(h,0,0);
	}
	public lesson10(int h,int m)
	{
		this(h,m,0);
	}
	public lesson10(int h,int m,int s)
	{
		settime(h,m,s);
	}
	public void settime(int h,int m,int s)
	{
		sethour(h);
		setmin(m);
		setsecond(s);
	}
	public void sethour(int h)
	{
		hour=((h>=0 &&h<=24)?h:0);
		
	}
	public void setmin(int m)
	{
	min=((m>=0 && m<=60)?m:0);
		
	}
	
public void setsecond(int s)
{
	
second=((s>=0 && s<=60)?s:0);
}
public int gethour() {
	return hour;
	
}
public int getmin() {
	return min;
	}
public int getsecond()
{
	return second;
	}
public String military() {
	return String.format("%02d:%02d:%02d", gethour(),getmin(),getsecond());
	
}
	public static void main(String[] args)
	{
		lesson10 abc =new lesson10();
		lesson10 abc1=new lesson10(5);
		lesson10 abc2=new lesson10(5,40);
		lesson10 abc3=new lesson10(5,40,50);
		System.out.println(abc.military());
		System.out.println(abc1.military());
		System.out.println(abc2.military());
		System.out.println(abc3.military());
		
	}
	}