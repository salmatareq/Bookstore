
package Model;


public class DemoBook extends Book{

    
    public DemoBook(String ISBN,String title,double price,int year){
    this.title=title;
    this.price=price;
  
    this.ISBN=ISBN;
    this.Publishing_year=year;
    }
  
    
    
    @Override
  public  boolean forSale() {
       return false;
    }

    @Override
  public  String getType() {
       return "demo";
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
    }
    @Override
    public int getYear() {
   return this.Publishing_year;    }
  @Override
    public double getPrice() {
  return this.price; 
    
    }
}
