package ch10.atm;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
   A graphical simulation of an automatic teller machine.
*/
public class ATMViewer
{  
   public static void main(String[] args)
   {  
      ATM theATM;

      try
      {  
         Bank theBank = new Bank();
         theBank.readCustomers("C:/Users/lar02/Documents/projects/BFH/prog2/src/ch10/atm/customers.txt");
         theATM = new ATM(theBank);
      }
      catch(IOException e)
      {  
         JOptionPane.showMessageDialog(null, 
               "Error opening accounts file.");
         return;
      }

      JFrame frame = new ATMFrame(theATM);
      frame.setTitle("First National Bank of Java");      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

