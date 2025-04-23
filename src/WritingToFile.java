import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) {
        try{
            File file = new File("Heaven.txt");
            FileWriter writer = new FileWriter(file,true);
            //If you want to add content without erasing old text,(file,true) append the true
            writer.write("Hello Santosh! ✨\nWelcome to Java File Handling.\nLet's master it step by step.");

            writer.close(); // Save content properly
            // Without closing, the content stays in memory and might not reach the file.

            System.out.println("In file Writed");
        } catch (IOException e) {
            System.out.println("❌ An error occurred while writing.");
            e.printStackTrace();
        }
    }
}
