import java.io.File;
import java.io.IOException:
public class CreatingFile { 
    public static void main(String[] args) {
        File myFile = new File("Creating file.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
