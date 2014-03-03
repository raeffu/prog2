package ch10.email;

import java.util.ArrayList;

public class MailBox {

  private User user;
  private ArrayList<Messages> messages;
  
  public MailBox(User user){
    this.user = user;
  }
  
//  public void storeMessages(){}
  public String printAllMessages(){return "";}
//  public User getUser(){return null;}
  public void addMessage(Messages m){}
  
}
