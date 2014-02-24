package _excercises.ch10.enumeration;

public class MonthEnumTester {
  
  public static void main(String[] args) {
    MonthType[] months = MonthType.values();
    
    for(MonthType month : months){
      System.out.println(month + " - Month " + month.value() + " - Number of days: " + month.daysOfMonth() );
    }
    
    MonthType month = MonthType.JANUARY;
    Integer n = new Integer(month.value());
    
    System.out.println("");
    System.out.println("Conversion: Month "+month+" -> Integer "+n);
    
    MonthType testMonth = month.getMonth(n);
    
    System.out.println("Conversion: Integer "+n+" -> Month "+testMonth);
    
    if(month == testMonth){
      System.out.println("Month " +month+ " and testMonth "
                        +testMonth+ " are equal? " + (month==testMonth));
    }
    
    System.out.println("");
    System.out.println("All summer month:");
    
    for(MonthType m : months){
      if(m.getSeason() == SeasonType.SUMMER) {
        System.out.println(m);
      }
    }
  }
  
}