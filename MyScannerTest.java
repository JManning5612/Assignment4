package Assignment4;

//Jlon Manning (JManning5612@toromail.csudh.edu)

import java.io.*;

public class MyScannerTest {
 public static void main(String[] args) {
     try {
         String input = "123 45.67 true false\nHello World\n";
         InputStream inputStream = new ByteArrayInputStream(input.getBytes());
         MyScanner scanner = new MyScanner(inputStream);

         System.out.println(scanner.nextInt());         // 123
         System.out.println(scanner.nextDouble());      // 45.67
         System.out.println(scanner.nextBoolean());     // true
         System.out.println(scanner.nextBoolean());     // false
         System.out.println(scanner.nextLine());        // Hello World
         System.out.println(scanner.next());            // NoSuchElementException

     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
