import java.io.FileReader;
import java.io.IOException;

class ReadFile { 
    public static void main(String[] args) {
        char[] array = new char[100];
        try {
            FileReader input = new FileReader("input.txt");

            
            int length = input.read(array); 
            System.out.println("Data in the file:");
            System.out.println(new String(array, 0, length)); 

            
            input.close();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
