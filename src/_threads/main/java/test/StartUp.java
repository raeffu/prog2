package _threads.main.java.test;

public class StartUp {
  public static void main(String[] args){
    ThreadTester test = new ThreadTester("Thread 1", 20);
    ThreadTester test2 = new ThreadTester("Thread 2", 30);
    ThreadTester test3 = new ThreadTester("Thread 3", 40);
    
//    test.run();
//    test2.run();
//    test3.run();
    
    test.setDaemon(false);
    test2.setDaemon(false);
    test3.setDaemon(true);
    
    test.start();
    test2.start();
    test3.start();
    
    for(int i=0; i<10; i++){
      try {
        Thread.sleep(1000);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Main: " + i);
    }
  }
}
