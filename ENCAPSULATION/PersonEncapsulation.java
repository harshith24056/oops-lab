public class Person {
    private String name; 
    private int age;     

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationMethod {
    public static void main(String[] args) {
        Person person = new Person();
        
        person.setName("N.Harshith");
        person.setAge(18);

        System.out.println("Name: " + person.getName()); 
        System.out.println("Age: " + person.getAge());   
    }
}

