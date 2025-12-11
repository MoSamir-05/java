import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        try {
            // ---------- Writing data to file ----------
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("Hello, this is a simple file write example.\n");
            writer.write("Java file handling is easy!");
            writer.close();
            System.out.println("Data written to file successfully!");

            // ---------- Reading data from file ----------
            FileReader reader = new FileReader("myfile.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nReading Data from File:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
