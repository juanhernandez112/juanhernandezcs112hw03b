
public class Date 
{

	// Variables
	private int monthDate, dayDate, yearDate;

	public Date (int month, int day, int year)
	{
		
		monthDate = month;
		dayDate = day;
		yearDate = year;
		
	}

	public int getmonthDate()
	{
		return monthDate;
	}
	
	public void setMonthDate(int month)
	{
		monthDate = month;
	}
	public int getdayDate()
	{
		return dayDate;
		
	}
	public void setDayDate(int day)
	{
		dayDate = day;
	}
	public int getyearDate()
	{
		return yearDate;
		
	}
	public void setYearDate(int year)
	{
		dayDate = year;
	}
	public void displayDate()
	{
		System.out.printf("%d/%d/%d", getmonthDate(), getdayDate(), getyearDate());
	}
}
