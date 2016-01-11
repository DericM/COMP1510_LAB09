package reverseArray;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    
    public static void main(String[] args)  {  
        Integer reverse[];
        Scanner scan = new Scanner(System.in);
        int length;
        Integer placeHolder;
        
        System.out.print("How many numbers are in the array?");
        
        length = scan.nextInt();
        reverse = new Integer[length];
        
        for(int i = 0;i<length;i++){
            System.out.print("Array[" + i + "]: ");
            reverse[i] = scan.nextInt();
        }
        
        System.out.println(Arrays.deepToString(reverse));
        
        for(int i =0;i<reverse.length/2;i++){
            placeHolder = reverse[i];
            reverse[i] = reverse[reverse.length-1-i];
            reverse[reverse.length-1-i] = placeHolder;
        }
        
        System.out.println(Arrays.deepToString(reverse));
        
    }
}

