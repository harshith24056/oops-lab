class Car {
    String model;
    int year;
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020); 
        car1.display(); 
    }
}

