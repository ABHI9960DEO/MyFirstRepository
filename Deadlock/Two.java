package Deadlock;

/**
 *
 * @author Abhishek
 */
public class Two 
{
    public synchronized void bar(One o)
    {
        System.out.println("Thread from 2 is executed");
        try
        {
            Thread.sleep(2000);
        }catch(Exception e){}
        System.out.println("Thread2 trying to call o.last()");
        o.last();
    }

    public synchronized void last() 
    {
        System.out.println("Thread 2 last method is executed");
    }
}
