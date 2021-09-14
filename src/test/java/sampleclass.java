import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleclass
{
    @BeforeTest
    public void shane()
    {
        System.out.println("before test");
    }
    @Test
    public void createtest()
    {
      System.out.println("Verification done");
    }

    public static void main(String args[])
    {
      System.out.println("Inside main program");
    }
}
