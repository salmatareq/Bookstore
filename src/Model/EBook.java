
package Model;


public class EBook extends Book {
String fileType;
 public EBook(String ISBN,String title,double price,int year,String fileType){
    this.title=title;
    this.price=price;
    this.fileType=fileType;
    this.ISBN=ISBN;
    this.Publishing_year=year;
    }
  
  
  
    @Override
   public boolean forSale() {
       return true;
    }

    @Override
  public  String getType() {
   return "EBook";
    
    }
      @Override 
   public String getName(){
       return title;
   }
    @Override
    public String getISBN() {
       return ISBN;
    }
    @Override
   public void deliver(String email, String address) {
        System.out.println("book store: Shipping paper book to " + email);
     }
     @Override
    public int getYear() {
   return this.Publishing_year;    }
  @Override
    public double getPrice() {
  return this.price;   }
}
