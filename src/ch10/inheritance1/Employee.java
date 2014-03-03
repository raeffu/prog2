package ch10.inheritance1;

public class Employee extends Person {
  private String _department;

  public Employee(String name, String email, String department){
    super(name, email);
    _department = department;
  }
  
  public String get_department() {
    return _department;
  }

  public void set_department(String department) {
    _department = department;
  }

  @Override
  public String getDescription() {
    return "Employee works in " + _department;
  }
  
}
