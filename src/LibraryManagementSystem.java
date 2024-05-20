import javax.naming.directory.SearchControls;
import java.util.*;

public class LibraryManagementSystem {
    Book[] books = new Book[10];
    Scanner in = new Scanner(System.in);

    boolean bookSearch(String name){
        for(int i = 0; i < 10; i++){
            if(books[i].getTittle().compareTo(name) == 0){
                return true;
            }
        }
        return false;
    }

    public void addBook(){
        for(int i = 0; i < 10; i++){
            if(books[i].getAuthor().isEmpty()){
                System.out.println("Please enter the book name and author name:");

                System.out.print("Book name: ");
                String name = in.next();

                System.out.print("Author name: ");
                String author = in.next();
                if(bookSearch(name)){
                    System.out.println("The book is already available");
                }
                books[i] = new Book(name, author);
                return;
            }
            System.out.println("Adding more book is impossible");
        }
    }

    void removeBooks(String name){
        for(int i = 0; i < 10; i++){
            if(books[i].getTittle().compareTo(name) == 0){
                books[i] = new Book("","");
                System.out.println("Book is successfully removed");
                return;
            }
        }
        System.out.println("Book is not available");
    }





}
