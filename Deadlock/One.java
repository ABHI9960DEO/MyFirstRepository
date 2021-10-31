
package Deadlock;

/**
 *
 * @author Abhishek
 */
public class One 
{
    public synchronized void foo(Two t)
    {
        System.out.println("Thread class one executed");
        try
        {
            Thread.sleep(2000);
        }catch(Exception e)
        {}
            
       System.out.println("Thread1 trying to call t.last()");
        t.last();
    }
    public synchronized void last()
    {
        System.out.println("This is the last method");
    }

    
}
