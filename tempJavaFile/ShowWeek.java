import java.util.Calendar;

public class ShowWeek
{
	public static void main(String[] args)
	{
		String weekDate="";
		Calendar cal = Calendar.getInstance();

		int week=cal.get(Calendar.DAY_OF_WEEK)-1;

		switch(week){
			case 0:
				weekDate="Today is Sunday";
				break;
			case 1:
				weekDate="Today is Monday";
				break;
			case 2:
				weekDate="Today is Tuesday";
				break;
			case 3:
				weekDate="Today is Wednesday";
				break;
			case 4:
				weekDate="Today is Thursday";
				break;
			case 5:
				weekDate="Today is Friday";
				break;
			case 6:
				weekDate="Today is Saturday";
				break;	
	
		}

		System.out.println(weekDate);
	}
}
