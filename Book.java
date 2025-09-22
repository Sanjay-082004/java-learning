public class Book {
    String title;
    String author;
    double price;
    public Book(String title,String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book details = new Book("Whispers of the Dying Light","Anna Angelin M", 350);
        System.out.println("Book Name: "+details.title);
        System.out.println("Book Author: "+details.author);
        System.out.println("Book Price: Rs."+details.price);
    }
}