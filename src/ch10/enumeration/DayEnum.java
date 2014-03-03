package ch10.enumeration;

/**
 * Implements an enumeration type for the days of the week
 * @author lua1
 */
public class DayEnum {

	public enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THUERSDAY, FRIDAY, SATURDAY, SUNDAY;

		/**
		 * Evaluates, if the day is a weekday
		 * @return true, if the day is a weekday
		 */
		// This methods belongs to the enum type days
		public boolean isWeekDay() {
			switch (this) {
			case SUNDAY:
			case SATURDAY:
				return false;
			default:
				return true;
			}
		}

		/**
		 * Evaluates, if the day is on the Weekend (SATURDAY or SUNDAY)
		 * @return true, if the day is on the weekend
		 */
		// This methods belongs to the enum type Days
		public boolean isWeekEnd() {
			return !this.isWeekDay();
		}
	}

	public static void main(String[] _) {
		// some tests...
		Days day = Days.FRIDAY;
		System.out.println(day);
		System.out.println(day.ordinal());
		System.out.println(day.isWeekDay());
		System.out.println(Days.SUNDAY.isWeekDay());
		System.out.println(Days.SUNDAY.isWeekEnd());
	}
}
