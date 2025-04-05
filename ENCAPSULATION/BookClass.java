class Book{ 
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        
        Book book = new Book("1984", "George Orwell");

        
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());

        book.setTitle("Animal Farm");
        book.setAuthor("George Orwell");

        System.out.println("Updated Title: " + book.getTitle());
        System.out.println("Updated Author: " + book.getAuthor());
    }
}
