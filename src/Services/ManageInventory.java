
package Services;
import Model.Book;
import Model.paperBook;
import java.time.Year;
import java.util.*;
import static java.util.Collections.list;

public class ManageInventory {
 public List<Book> inventory=new ArrayList<>(); 
    public double paidAmount;
    public void addBook(Book b){
    inventory.add(b);
       
    }
    
    public double buyBook(String name ,int quantity,String email,String address){
        paidAmount=0;
        for(Book book:inventory){
        if(book.getName().equalsIgnoreCase(name))
        {if(book.forSale())
        {
            if(book.getType().equals("paper Book"))
            {
              paperBook pb = (paperBook) book;
                if(pb.getQuantity()>=quantity)
                {pb.setStock(quantity);
                
                pb.deliver(email, address);
                paidAmount+=book.getPrice()*quantity;
                return paidAmount;
                }
                else {
                    System.out.println("quantity is not available");
                    
                    break;}
            }
            else {
            
                  book.deliver(email, address);
                  
            paidAmount+=book.getPrice();
            return paidAmount;
            }
                
                
                }
               
        
        else 
        { System.out.println(book.getName()+" is not for sale");return 0;}
        
        }
        else {System.out.println("NOt found");return 0;}
    
}
    
    return 0;
    
    }
    
    public List removeBook(int  past_year){
    List<Book> deletedBooks=new ArrayList<>();
    List<Book> remainingBooks=new ArrayList<>();
    int currentYear = Year.now().getValue();
    for(Book b:inventory)
    {
      if(currentYear-b.getYear()>=past_year){
        deletedBooks.add(b);
        remainingBooks.add(b);
      }
    
    }
     inventory=remainingBooks;
       return  deletedBooks;
    }

    public void printAvailableBooks(){
    
    for(Book b:inventory){
        System.out.println(b.getName()+" ");
    }
    
    }


}
