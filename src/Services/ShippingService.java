
package Services;

import Model.Book;


public class ShippingService {
    
    
     public static void deliver(String address,Book book) {
        System.out.println("book store: Shipping "+book.getName()+" book to " + address);
     }
    
    
    
}
