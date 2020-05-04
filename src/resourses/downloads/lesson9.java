package resourses.downloads;
public class lesson9
{
	
private	int hours,min,second;
public void settime(int h,int m,int s)
{
	hours=((h>=0 && h<=24) ? h:0);
	min=((m>=0 && m<=60)? m:0);
	second=((s>=0 && s<=60)? s:0);
	
	}
public String military()
{
	return String.format("%02d:%02d:%02d", hours,min,second);
	}
public String time()
{
	return String.format("%d:%02d:%02d%s",((hours==0 || hours==60 )?12:hours%12),min,second,(hours<12?"AM" :"PM"));
	
	}

	public static void main(String[] args)
	{
		lesson9 abc=new lesson9();
		abc.settime(13,59,60);
		System.out.println("time in military");
		System.out.println(abc.military());
		abc.settime(12,0,0);
		System.out.println("time in common for public");
		System.out.println(abc.time());
	}
	}