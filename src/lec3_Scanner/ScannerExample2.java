
package lec3_Scanner;
import java.util.Scanner;
public class ScannerExample2 {
  
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a boolean:: ");
        boolean b = keyboard.nextBoolean();
        System.out.println(b);
    }
}
