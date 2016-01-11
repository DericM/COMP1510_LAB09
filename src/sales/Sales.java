package sales;

//***************************************************************  
// Sales.java  
//  
// Reads in and stores sales for each of 5 salespeople.  Displays  
// sales entered by salesperson id and total sales for all salespeople.  
//  
// ***************************************************************  

import java.util.Scanner;  
import java.text.NumberFormat;


public class Sales  {  

   public static void main(String[] args)  {  

      int salesPeople;
      int[] sales;
      int sum; 
      double average, max, min;
      NumberFormat currency = NumberFormat.getCurrencyInstance();
      
      Scanner scan = new Scanner(System.in);  
      
      System.out.print("How many sales people? ");  
      salesPeople = scan.nextInt();
      sales = new int[salesPeople]; 
      
      for (int i=0; i<sales.length; i++)  {  
           System.out.print("Enter sales for salesperson " + (i+1) + ": ");  
           sales[i] = scan.nextInt();  
      }  

      System.out.println("\nSalesperson  Sales");  
      System.out.println(" ------------------ ");  

      sum = 0;  
      max = min = sales[0];
      for (int i=0; i<sales.length; i++)  {  
           System.out.println("     " + (i+1) + "         " + currency.format(sales[i]));  
           sum += sales[i];  
           if(sales[i] > max){
               max = sales[i];
           }
           if(sales[i] < min){
               min = sales[i];
           }
      }  
      average = sum / sales.length;

      System.out.println("\nTotal sales: " + currency.format(sum));  
      System.out.println("Average sales: " + currency.format(average));  
      System.out.println("Max sales: " + currency.format(max));  
      System.out.println("Min sales: " + currency.format(min));  
   }  
}  
