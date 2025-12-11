package lab_manual.Q4;

import java.io.File;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name with path: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        // Check if file exists
        if (file.exists()) {
            System.out.println("File exists: Yes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Is File: " + file.isFile());
            System.out.println("File Size (bytes): " + file.length());
        } else {
            System.out.println("File does NOT exist!");
        }
    }
}
