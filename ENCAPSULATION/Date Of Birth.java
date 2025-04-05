import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Person {
    
    private LocalDate dateOfBirth;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        
        p1.setDateOfBirth(LocalDate.of(2007, 1, 6)); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("My date of birth is " + p1.getDateOfBirth().format(formatter));
    }
}

