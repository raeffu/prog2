package _threads.test;

public class ThreadTester extends Thread {
  private String _n;
  private int _live;
  
  private int c=0;

  public ThreadTester(String n, int live) {
    _n = n;
    _live = live;
  }

  public void run() {
    while (c<_live) {
      try {
        Thread.sleep(1000);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("n: " + _n +" c: "+ c++);
    }
  }
}
