package ch10.email;

import java.util.ArrayList;

public class MailBox {

  private User user;
  private ArrayList<Messages> messages;

  public MailBox(User user) {
    this.user = user;
    this.messages = new ArrayList<Messages>();
  }

  public void printAllMessages() {
    String s = "";
    
    for(Messages message : messages){
      s += "From :";
      s += message.getSender() + "\n";
      s += message.getText() + "\n";
    }
    
    System.out.println(s);
  }

  public void addMessage(Messages m) {
    messages.add(m);
  }

  public String getUserName() {
    return this.user.getUserName();
  }

}
