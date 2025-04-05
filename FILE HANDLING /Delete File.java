import java.io.File; 

class File { 
    public static void main(String[] args) {
        
        java.io.File fileToDelete = new java.io.File("file.txt"); conflict

        boolean value = fileToDelete.delete();
        if (value) {
            System.out.println("The File is deleted.");
        } else {
            System.out.println("The File is not deleted.");
        }
    }
}
