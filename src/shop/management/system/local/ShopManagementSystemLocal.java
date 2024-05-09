package shop.management.system.local;
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ShopManagementSystemLocal {

    
    public static void main(String[] args) {
       
    }
    public static void InventoryManager() throws FileNotFoundException {
  //  String code, name;
    
  //  double price;
     Scanner input = new Scanner(System.in);
     try(FileWriter f = new FileWriter(":C/Temp/StoreInventory.txt", true)){
             
    // PrintWriter pw= new PrintWriter(":C/Temp/StoreInventory.txt");)
             char addmore;
              do {
                System.out.print("Enter Product's code: ");
                String code = input.next();
                System.out.print("Enter Product's name: ");
                String name = input.next();
                System.out.print("Enter Product's price: ");
                double price = input.nextDouble();
                  System.out.println("Enter Product's amount:");
                int quantity = input.nextInt();
                
                f.write(String.format("%s %s %.2f %d%n", code, name, price, quantity));
                System.out.printf("%s %s has been added to your inventory list.%n", code, name);

                System.out.print("Do you want to add more products? (y/n): ");
                addmore = input.next().charAt(0);
            } while (addmore == 'y' || addmore == 'Y');
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
    
            


