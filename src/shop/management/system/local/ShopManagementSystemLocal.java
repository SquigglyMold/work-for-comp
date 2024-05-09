package shop.management.system.local;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShopManagementSystemLocal {

    
    public static void main(String[] args) {
        canner input = new Scanner(System.in); 
        
        
        System.out.print("Enter product name:");
        String prod_name = input.next();

        System.out.print("Enter product ID:");
         int ID = input.nextInt();
        
        System.out.print("Enter product description:");
        String description = input.next();
        
        System.out.print("Enter product quntity:");
         int amount = input.nextInt();
         
         System.out.print("Enter value per product:");
         double value = input.nextDouble();
         
         double totalValue = amount * value;

        File file = new File("C:/Inventory/inventory.txt");                                // this one too
        PrintWriter pw = new PrintWriter("C:/Inventory/inventory.txt");                  //file change it to what u storing it in Damion 
        
         pw.println("Product Name: " + prod_name);
            pw.println("Description: " + description);
            pw.println("Quantity: " + amount);
            pw.println("value: " + value + amount);
            pw.println("Total Inventory Value: " + totalValue);
            pw.println("ID: " + ID);
    
             
        System.out.print(prod_name+ " "+ description+" "+ amount +" "+totalValue+" has been added to Inventory");
        pw.close();
    }
    //hello
}
