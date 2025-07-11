
package Model;


abstract public class Book {
    protected String ISBN,title;
    protected int Publishing_year;
    protected double price;
   
    
    abstract public boolean forSale();
    
    abstract public String getType();
     abstract public String getName();
      abstract public String getISBN();
       abstract public int getYear();
   
   abstract public double getPrice();
}
