package Deadlock;

/**
 *
 * @author Abhishek
 */
public class DeadlockMain implements Runnable
{
    One o = new One();
    Two t = new Two();
        
    DeadlockMain()
    {
        Thread th = new Thread(this);
        th.start();
        o.foo(t);
    }
    public void run()
    {
        t.bar(o);
        
    }
    public static void main(String[] args) {
        new DeadlockMain();
    }
}
