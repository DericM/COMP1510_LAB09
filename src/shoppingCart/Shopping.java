package shoppingCart;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        ShoppingCart shop = new ShoppingCart();
        
        String itemName;
        double price;
        int quantity;
        
        do{
            
            System.out.print("What would you like to buy? ");
            itemName = scan.next();
            System.out.print("What is the price? ");
            price = scan.nextDouble();
            System.out.print("What is the quantity? ");
            quantity = scan.nextInt();
            
            shop.addToCart( itemName,  price,  quantity);
            
            
            
            System.out.print ("keepShopping (y/n)? "); 
            keepShopping = scan.next();
            System.out.println (); 
        }
        while (keepShopping.equals("y")); 
        
        System.out.print (shop.toString()); 
        

    }

}
