package lec3_Scanner;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String args[]) {
 Scanner keyboard = new Scanner(System.in);
 System.out.print("Enter a float :: ");
 float f = keyboard.nextFloat();
 System.out.println(f);
 System.out.print("Enter a double number :: ");
 double d = keyboard.nextDouble();
 System.out.println(d);
    }
}
