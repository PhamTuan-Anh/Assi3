package lec3_Scanner;

import java.util.Scanner;

public class ScannerBai10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("##|\\n");
        System.out.println("Enter words separated by '##': ");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
