package ch10.enumeration.solutions;

/**
 * Enumeration type for the months of the year
 * @author lua1
 * 
 */
public enum MonthType {
	JANUARY(1, 31), FEBRUARY(2, 28), MARCH(3, 31), APRIL(4, 30), MAY(5, 31), JUNE(
			6, 30), JULY(7, 31), AUGUST(8, 31), SEPTEMBER(9, 30), OCTOBER(10,
			31), NOVEMBER(11, 30), DECEMBER(12, 31);

	private int monthCode;
	private int days;

	// Constructor with parameters
	private MonthType(int codeOfMonth, int daysOfMonth) {
		this.monthCode = codeOfMonth;
		days = daysOfMonth;
	}

	/**
	 * Return the code of month
	 * 
	 * @return code of month
	 */
	public int value() {
		return monthCode;
	}

	/**
	 * Evaluates the number of days
	 * 
	 * @return number of days
	 */
	public int daysOfMonth() {
		return days;
	}

	/**
	 * Converts an Integer into a MonthType
	 * 
	 * @return correct MonthType
	 */
	public static MonthType getMonth(int monthCode) {
		for (MonthType months : MonthType.values())
			if (months.value() == monthCode)
				return months;
		return null;
	}

	public SeasonType getSeason() {
		SeasonType s = SeasonType.WINTER;
		switch (monthCode) {
		case 3:
		case 4:
		case 5:
			s = SeasonType.SPRING;
			break;
		case 6:
		case 7:
		case 8:
			s = SeasonType.SUMMMER;
			break;
		case 9:
		case 10:
		case 11:
			s=SeasonType.FALL;
			break;
		}
		return s;
	}

}