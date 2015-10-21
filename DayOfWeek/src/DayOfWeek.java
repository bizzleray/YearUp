
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[]args)
	{
		System.out.println("Enter the day of the week");
		Scanner sc = new Scanner(System.in);
		String dayOfWeek = sc.nextLine();
		EvaluateDayOfWeek(dayOfWeek);

	}

	public static void EvaluateDayOfWeek(String dayOfWeek) 
	{
		if (dayOfWeek != null)
		{
			if (!dayOfWeek.isEmpty())
			{
				if (dayOfWeek.equalsIgnoreCase("monday")||
						dayOfWeek.equalsIgnoreCase("tueday")||
						dayOfWeek.equalsIgnoreCase("wednesday")||
						dayOfWeek.equalsIgnoreCase("thursday")||
						dayOfWeek.equalsIgnoreCase("friday"))
				{
					System.out.println(dayOfWeek+ " is a weekday!");
					}
				else
			}
		}
		else
		{
			System.out.println("Day of week is an empty string!!");
		}
}