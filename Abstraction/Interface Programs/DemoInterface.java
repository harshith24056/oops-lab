interface FirstInterface {
    public void myMethod(); 
}
interface SecondInterface {
    public void myOtherMethod(); 
}

interface DemoInterface {
    void demonstrate(); 
}
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}
class DemoImplementation implements DemoInterface {
    public void demonstrate() {
        DemoClass myObj = new DemoClass(); 
        myObj.myMethod(); 
        myObj.myOtherMethod();  
    }
}
public class Interface {
    public static void main(String[] args) {
        DemoImplementation demo = new DemoImplementation(); 
        demo.demonstrate(); 
    }
}

