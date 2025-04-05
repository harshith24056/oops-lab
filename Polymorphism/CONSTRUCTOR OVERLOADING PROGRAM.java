    class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
    }
    Student(String name) {
        this.name = name;
        this.age = 25; 
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
                  public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Varun");
        Student student3 = new Student("Deepthi", 23);

        student1.display();
        student2.display();
        student3.display();
    }
}

