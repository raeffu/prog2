package ch10.email;

import java.util.ArrayList;

public class EmailSystem {

  private ArrayList<MailBox> mailboxes;
  private ArrayList<User> users;
  
  public EmailSystem(){
    this.mailboxes = new ArrayList<MailBox>();
    this.users = new ArrayList<User>();
  }
  
  public void sendMessage(User from, User to, String message) {
    Messages msg = new Messages(from.getUserName(), to.getUserName(), message);
    MailBox target = findMailBox(to);
    
    target.addMessage(msg);
  }

  public MailBox createMailBox(User user) {
    
    for(MailBox mailbox : mailboxes){
      if(mailbox.getUserName().equals(user.getUserName()))
        return mailbox;
    }
    
    MailBox newMailBox = new MailBox(user);
    mailboxes.add(newMailBox);
    return newMailBox;
  }

  public MailBox findMailBox(User user) {
    for(MailBox mailbox : mailboxes){
      if(mailbox.getUserName().equals(user.getUserName())) 
        return mailbox;
    }
    
    return null;
  }

  public User createUser(String username) {

    for(User user : users){
      if(user.getUserName().equals(username)){
        return user;
      }
    }

    User newUser = new User(username);
    users.add(newUser);
    return newUser;
  }

}
