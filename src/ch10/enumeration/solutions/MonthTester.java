package ch10.enumeration.solutions;

/**
 * Tests an enumeration type for the months of the year
 * 
 * @author lua1
 */

public class MonthTester {

	public static void main(String[] args) {

		// loop the month
		MonthType[] types = MonthType.values();
		for (MonthType t : types)
			System.out.println(t + " - Month " + t.value()
					+ " - Number of days: " + t.daysOfMonth());

		// Convert MonthType to Integer
		MonthType month = MonthType.JANUARY;
		Integer i = new Integer(month.value());
		System.out.println("Conversion:  Month "+ month +" -> Integer "+i);
		
		// Convert Integer to MonthType 
		MonthType month2 = MonthType.getMonth(i);
		System.out.println("Conversion:  Integer "+ i +" -> Monath "+month2);

		
		// Comparisom 
		if (month == month2) {
			System.out.println("Month "+ month +" and month2 "+month2+" are equal.");
		} else {
			System.out.println("Month "+ month +" and month2 "+month2+" aren't equal.");
		}

		// Find the summer month
		System.out.println("The summer months: ");
		for (MonthType t : types)
			if (t.getSeason() == SeasonType.SUMMMER)
				System.out.print(t + " ");

	}

}
