import java.util.concurrent.Semaphore;

public class DiningPhilosophers {

  public static void main(String[] args) {
    int numPhilosophers = 5;
    Philosopher[] philosophers = new Philosopher[numPhilosophers];
    Semaphore table = new Semaphore(numPhilosophers - 1);

    for (int i = 0; i < numPhilosophers; i++) {
      philosophers[i] = new Philosopher(i, table);
      new Thread(philosophers[i]).start();
    }
  }


