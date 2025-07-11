
package Services;

import Model.Book;


public class Mailservice {
    public static void deliver(String email,Book book) {
        System.out.println("book store: Shipping "+book.getName()+"book to " + email);
     }
    
}
