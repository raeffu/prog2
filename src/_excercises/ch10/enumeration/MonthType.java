package _excercises.ch10.enumeration;

public enum MonthType{
  JANUARY(1, 31), FEBRUARY(2, 28), MARCH(3, 31), APRIL(4, 30), MAY(5, 31),
  JUNE(6, 30), JULY(7, 31), AUGUST(8, 31), SEPTEMBER(9, 30), OKTOBER(10, 31),
  NOVEMBER(11, 30), DEZEMBER(12, 31);
  
  private int _code;
  private int _days;
  
  MonthType(int code, int days){
    _code = code;
    _days = days;
  }
  
  public int value(){
    return _code;
  }
  
  public int daysOfMonth(){
    return _days;
  }
  
  public MonthType getMonth(int value){
    
    MonthType[] months = MonthType.values();
    if (value > months.length) { return null; }
    else { return months[value-1]; }
  }
  
  public SeasonType getSeason(){
    
    switch (this) {
    case DEZEMBER:
    case JANUARY:
    case FEBRUARY:
      return SeasonType.WINTER;
    case MARCH:
    case APRIL:
    case MAY:
      return SeasonType.SPRING;
    case JUNE:
    case JULY:
    case AUGUST:
      return SeasonType.SUMMER;
    default:
      return SeasonType.AUTUM;
    }
  }
  
}
