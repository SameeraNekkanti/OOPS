package objects;
public class Bookstore {

    public static void main(String[] args) {

        Book book1=new Book();
        System.out.println("Book Details (Default Constructor):");
        book1.displayDetails();

        System.out.println();

        Book book2=new Book("The Java Handbook", "Patrick Naughton", 500.0);
        System.out.println("Book Details (Parameterized Constructor):");
        book2.displayDetails();

        System.out.println();

        book1.setDetails("Effective Java", "Joshua Bloch", 800.0);
        System.out.println("Updated Book Details:");
        book1.displayDetails();
    }
}
		class Book{
			private String title;
			private String author;
			private double price;
			public Book() {
				title="Not Available";
				author="Not Available";
				price=0.0;
				
			}
			public Book(String title,String author, double price) {
				this.title=title;
				this.author=author;
				this.price=price;
			}
			public void setDetails(String title,String author, double price) {
				this.title=title;
				this.author=author;
				this.price=price;
			}
			public void displayDetails() {
				System.out.println("Title: "+title);
				System.out.println("Author: "+author);
				System.out.println("Price: "+price);
			}
		}

		

