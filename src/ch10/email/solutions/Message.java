package ch10.email.solutions;
import java.util.Scanner;
import java.io.IOException;

/**
   An email message.
*/
public class Message
{  
   /**
      Constructs a Message object.
      @param from the sender of the message
   */
   public Message(String from)
   {  
      sender = from;
      text = "";
   }

   /**
      Reads the message.
      @param in the in reader
   */
   public void read(Scanner in)
       throws IOException
   {  
      System.out.print("Mail to: ");
      recipient = in.nextLine();
      System.out.println("Enter text, blank line to end:");
      while (true)
      {  
         String line = in.nextLine();
         if (line.length() < 1)
            return;
         else
            text = text + line + "\n";
      }
   }
   
   /**
      Gets the recipient.
      @return the recipient
   */
   public String getRecipient()
   {  
      return recipient;
   }

   /**
      Formats the email message.
   */
   public String format()
   {
      return "From: " + sender + "\n" + "To: " + recipient + "\n" + text + "\n";
   }

   private String sender;
   private String recipient;
   private String text;
}
