package ch10.email.solutions;
import java.util.ArrayList;
import java.io.PrintWriter;

/**
   An email mailbox.
*/
public class Mailbox
{  
   /**
      Constructs a Mailbox object.
      @return u the user
   */
   public Mailbox(String u)
   {  
      user = u;
      messages = new ArrayList<Message>();
   }
   
   /**
      Gets the user.
      @return the user of this mailbox
   */   
   public String getUser()
   {  
      return user;
   }

   /**
      Adds a message to the list.
      @param m the message to add
   */
   public void addMessage(Message m)
   {  
      messages.add(m);
   }

   /**
      Prints all messages.
   */
   public void print(PrintWriter out)
   {  
      for (Message m : messages)
         out.print(m.format());
   }

   private String user;
   private ArrayList<Message> messages;
}
