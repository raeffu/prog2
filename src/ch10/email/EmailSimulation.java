package ch10.email;

import java.util.Scanner;

public class EmailSimulation {

  public static void main(String[] args) {
    EmailSimulation e = new EmailSimulation();
    e.simulate();
  }

  public void simulate() {

    EmailSystem system = new EmailSystem();

    Scanner in = new Scanner(System.in);
    String input = "";

    User currentUser = null;

    boolean loggedIn = false;
    boolean running = true;

    while (running) {
      this.showMenu();

      input = in.nextLine();

      if ("I".equalsIgnoreCase(input)) {
        
        System.out.println("User name:");
        currentUser = system.createUser(in.nextLine());
        system.createMailBox(currentUser);
        
        loggedIn = true;
        System.out.println("logged in as "+ currentUser.getUserName());
      }
      else if ("S".equalsIgnoreCase(input)) {
        if(loggedIn){
          System.out.println("Mail to:");
          
          User receiver = system.createUser(in.nextLine());
          system.createMailBox(receiver);
          
          System.out.println("Enter text, blank line to end:");
          String message = in.nextLine();
          
          system.sendMessage(currentUser, receiver, message);
        }
        else{
          System.out.println("Please log in first");
        }
      }
      else if ("R".equalsIgnoreCase(input)) {
        if(loggedIn){
          MailBox myMail = system.findMailBox(currentUser);
          myMail.printAllMessages();
        }
        else{
          System.out.println("Please log in first");
        }
      }
      else if ("O".equalsIgnoreCase(input)) {
        if(loggedIn){
          currentUser = null;
          loggedIn = false;
        }
        else{
          System.out.println("Please log in first");
        }
      }
      else if ("Q".equalsIgnoreCase(input)) {
        running = false;
        in.close();
      }
      else {
        System.out.println("Not valid input!");
      }
    }

  }

  public void showMenu() {
    String s = "***Menu***" + "\n" + "Log in [i]" + "\n" + "Send message [s]"
        + "\n" + "Read message [r]" + "\n" + "Log out [o]" + "\n" + "Quit [q]";
    System.out.println(s);
  }

  public void handleUserInput() {
  }

}
