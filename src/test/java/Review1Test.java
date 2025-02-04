import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class Review1Test {

   @Test
   public void testQ1()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Review1.q1();

     // assertion
     assertEquals("There once was a man from St. Ives.\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void testQ2()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Review1.q2();

     // assertion
     assertEquals("1\n4\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void testQ3()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Review1.q3();

     // assertion
     assertEquals("Hello\nHello again\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void testQ4()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Review1.q4();

     // assertion
     assertEquals("true\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void testQ5()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Review1.q5();

     // assertion
     assertEquals("Hello World", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
}
