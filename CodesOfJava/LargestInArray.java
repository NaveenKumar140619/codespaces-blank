package CodesOfJava;

//import java.util.*;

//9. Find the Largest Element in an Array

public class LargestInArray{
        
    public static void main(String[] args) 
    { 
        int[] arr = {1, 3, 5, 7, 9}; 
        int largest = arr[0]; 
        for (int num: arr) {
             if (num > largest) { 
                largest = num;
             } 
    } 
    System.out.println(largest);
} 
}

     
