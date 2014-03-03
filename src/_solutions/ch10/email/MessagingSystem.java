package _solutions.ch10.email;
import java.util.ArrayList;
import java.io.PrintWriter;

/**
   An email messaging system.
*/
public class MessagingSystem
{  
   /**
      Constructs a MessagingSystem object
   */
   public MessagingSystem()
   { 
      mailboxes = new ArrayList<Mailbox>();
   }
   
   /**
      Delivers a message to the recipient.
      @param m the message
   */
   public void deliver(Message m)
   {  
      Mailbox box = find(m.getRecipient());
      box.addMessage(m);
   }

   /**
      Prints the messages.
      @param user the user
   */
   public void printMessages(String user)
   {  
      Mailbox box = find(user);
      PrintWriter out = new PrintWriter(System.out);
      box.print(out);
      out.flush();
   }
   
   /**
      Finds a mailbox or creates a new one if none existed for 
      the given user.
      @param user the user
      @return the mailbox of the user
   */
   private Mailbox find(String user)
   {  
      for (Mailbox m : mailboxes)
         if (m.getUser().equals(user))
            return m;
      
      Mailbox m = new Mailbox(user);
      mailboxes.add(m);
      return m;
   }

   private ArrayList<Mailbox> mailboxes;
}
