package _solutions.ch10.email;

import java.util.Scanner;
import java.io.IOException;

/**
   A menu for the email messaging system.
*/
public class EmailMenu
{
   /**
      Constructs an EmailMenu object.
   */
   public EmailMenu()
   {
      in = new Scanner(System.in);
   }

   /**
      Runs the system.
      @param system the email messaging system
   */
   public void run(MessagingSystem system)
         throws IOException
   {
      boolean more = true;
      String currentUser = null;
      
      while (more)
      {  
         System.out.println(
               "Log I)n  S)end message  R)ead messages  Log O)ut  Q)uit");
         String command = in.nextLine().toUpperCase();

         if (command.equals("I"))
         {  
            System.out.print("User name: ");
            currentUser = in.nextLine();
         }
         else if (command.equals("O"))
         {  
            currentUser = null;
         }
         else if (command.equals("Q"))
         {
            more = false;
         }
         else if (command.equals("R"))
         { 
            if (currentUser == null)
               System.out.println("Log in first!");
            else
               system.printMessages(currentUser);
         }
         else if (command.equals("S"))
         { 
            if (currentUser == null)
               System.out.println("Log in first!");
            else
            {  
               Message msg = new Message(currentUser);
               msg.read(in);
               system.deliver(msg);
            }
         }
      }
   } 
   
   private Scanner in;
}