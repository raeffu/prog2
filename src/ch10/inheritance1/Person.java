package ch10.inheritance1;

public class Person {

  private String _name;
  private String _email;
  
  public Person(String name, String email){
    _name = name;
    _email = email;
  }
   
  public String getName(){
    return _name;
  }
  public String getEmail(){
    return _email;
  }
  public void setName(String name){
    _name = name;
  }
  public void setEmail(String email){
    _email = email;
  }
  
  public String getDescription(){
    return "A person with name: " + _name;
  }
  
}
