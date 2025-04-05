interface Base Interface {
    void base Method(); 
}
interface Extended Interface extends Base Interface {
    void extended Method(); 
}
class My Class implements Extended Interface {
    @Override
    public void base Method() {
        System.out.println("Implementation of base Method");
    }
    @Override
    public void extended Method() {
        System.out.println("Implementation of extended Method");
    }
}
        public class Extending Interfaces {
    public static void main(String[] args) {
        My Class my Class = new My Class();
        myClass.baseMethod(); 
        myClass.extendedMethod(); 
    }
}

