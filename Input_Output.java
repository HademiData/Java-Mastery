import java.io.*;
import java.util.Scanner;


public class Input_Output {
    
    
    
     public static void main(String args[]) throws IOException {
            
            Scanner s = new Scanner(System.in);
            System.out.print("Enter your height in centimeters:");
            float height = s.nextFloat();
            
            System.out.print("Enter your weight in kilograms: ");
            float weight = s.nextFloat();
            
            float bmi = weight/(height*height)*10000;
            System.out.println("Your body mass index is " + bmi + ".");
         }
    
}
