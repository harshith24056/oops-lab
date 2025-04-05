class One { 
  public void printOne() { 
    System.out.println("printOne() method of One class."); 
  } 
} 
class Two extends One { 
  public void printTwo() { 
    System.out.println("printTwo() method of Two class."); 
  } 
} 
 
public class Main extends Two { 
  public static void main(String args[]) { 
    Main obj = new Main(); 
     obj.printOne(); 
    obj.printTwo(); 
  } 
} 

