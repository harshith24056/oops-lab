import java.io.FileWriter;
import java.io.IOException; 
class WriteAFile { 
    public static void main(String[] args) {
        String data = "This is the data in the output file";
        try {
            
            FileWriter output = new FileWriter("output.txt");

            
            output.write(data);
            System.out.println("Data is written to the file.");

            output.close();
        } catch (IOException e) { 
            e.printStackTrace(); 
        }
    }
}
