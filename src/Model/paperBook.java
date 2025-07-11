
package Model;


public class paperBook extends Book  {

   public int stock;
   public paperBook(String ISBN,String title,double price,int year,int stock){
    this.title=title;
    this.price=price;
    this.stock=stock;
    this.ISBN=ISBN;
    this.Publishing_year=year;
    
    }
    
    
    
    @Override
   public boolean forSale() {
       return true; 
    }

    @Override
   public String getType() {
        return "paper Book";
    }
   @Override 
   public String getName(){
       return title;
   }
  public int getQuantity(){
      return stock;
  }  
public void setStock(int x){
stock-=x;

}
    @Override
    public String getISBN() {
       return ISBN;
    }
     @Override
   public void deliver(String email, String address) {
        System.out.println("book store: Shipping paper book to " + address);
     }

    @Override
    public int getYear() {
   return this.Publishing_year;    }

    @Override
    public double getPrice() {
  return this.price;   }

   
}
