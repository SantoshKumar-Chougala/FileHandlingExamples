import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Heaven.txt");

        if(file.createNewFile()){ // it will create new file
            System.out.println("🌟 File created successfully: " + file.getName());
        }else{
            System.out.println("Already Exist");
        }
        System.out.println(file.exists()); // it will check file will be exit or not

        if(file.exists()){
            System.out.println("📁 File Name: " + file.getName());
            System.out.println("📍 Absolute Path: " + file.getAbsolutePath());
            System.out.println("🧵 Writable? " + file.canWrite());
            System.out.println("👀 Readable? " + file.canRead());
            System.out.println("📏 File Size (bytes): " + file.length());
        }
    }
}