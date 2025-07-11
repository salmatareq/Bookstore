
package bookstore;
import java.util.*;
import Model.Book;
import Model.DemoBook;
import Model.EBook;
import Model.paperBook;
import Services.ManageInventory;


public class Bookstore {

    public static void main(String[] args) {
       
        paperBook b1=new paperBook("123", "Java Basics", 100.0,2010, 10);
        paperBook b2=new paperBook("125", "cpp Basics", 150.0,2019, 9);
      EBook b3=new EBook("456", "Learn AI",70.0, 2021,  "PDF");
      DemoBook b4=new DemoBook("789", "Ancient Manuscripts", 0.0, 1975);
 
       ManageInventory store=new ManageInventory(); 
        store.addBook(b1);
        store.addBook(b2);
        store.addBook(b3);
        store.addBook(b4);
       
        
        
            System.out.println("Managers are only allowed");
            System.out.println("Enter the number of years to remove the books that you are outdated");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        input.nextLine();
       List<Book> removedBooks=new ArrayList<>();
        removedBooks= store.removeBook(x);
        
        System.out.println("Available Books");
        store.printAvailableBooks();
        System.out.println("===============================");
      System.out.println("Enter your ");
            System.out.println("Email :");
              String email=input.nextLine();
            System.out.println("Address : ");
            String Address=input.nextLine();
       double paidAmount=0;
            while(true){     
        System.out.println("which book do you want");
        String bName=input.nextLine();
        System.out.print("Quantity : ");
        int Q=input.nextInt();
      paidAmount+=store.buyBook(bName, Q, email,Address);
   
            System.out.println("....................................");
            System.out.println("Do you want to buy more Yes/NO");
           input.nextLine();
            String ans=input.nextLine();
            if(ans.equalsIgnoreCase("no"))
                break;
    } System.out.println("paid amount is : "+paidAmount);
    }
}
