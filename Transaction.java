
package shop.management.system.local;

import java.io.FileWriter;
import java.io.IOException;


 public abstract class Transaction {
     private String paymentmethod;
 
     private int ordercode;
    private String productnames;
    private int quantity;
    private double totalprice;

    public Transaction(String paymentmethod, int ordercode,String productnames,int quantity,double totalprice){
        this.paymentmethod =paymentmethod ;
        this.productnames=productnames;
        this.ordercode=ordercode;
        this.quantity=quantity;
        this.totalprice=calculateOrder();
    }

  //  private double calculateOrder() {
    //    throw new UnsupportedOperationException("Not supported yet."); 
   // }

    public static void Transaction(){
        System.out.println("CASH or CARD");
       
    }

   
  public abstract double calculateOrder();
  public void writeToFile(){
      try(FileWriter fw=new FileWriter(":C/Temp/StoreInventory.txt", true)){
          fw.write("product ID: " +ordercode+ "\t");
          fw.write("payment method (cash or card): " +paymentmethod+ "\t");
          fw.write("Total Price: $" + String.format("%.2f", totalprice) + "\t");
          fw.write(productnames);
          fw.write("Quantity" +quantity+ "\t");
           fw.close();
            System.out.println("Transaction details written to StoreInventory.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
          
    Cash extends Transaction{
    public Cash(int ordercode,String productnames,int quantity){
     super("Payment in Cash",ordercode,productnames,quantity);

}
@Qverride
public double calculateOrder(){
double vatrate = 0.15;
double itemprice = 100.00;//change the numbers according to product price
return itemprice * getquantity() * vatrate;
}
}   

Card extends Transaction{
    public Card(int ordercode,String productnames,int quantity){
     ("Payment in Card",ordercode,productnames,quantity);

}
@Qverride
public double calculateOrder(){
double vatrate = 0.18;
double itemprice = 100.00;//change the numbers according to product price
return itemprice * getquantity() * vatrate;
}
}   
  
     
          
  
  
