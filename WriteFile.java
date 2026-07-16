import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Hello, World!\n");

            writer.close(); // Close the file

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}