import java.io.*;

public class WritingFileInBufferAndPrintWriter {
    public static void main(String[] args) {
        File file = new File("Heaven.txt");
        try {
            //printWriter provides methods like print and println and printf
            //BufferWriter provides boost the performance and it will store text not charcter wise
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
            writer.println("hey java developer");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
