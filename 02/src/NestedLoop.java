//package app.main;
import java.util.Scanner;

public class NestedLoop {
    public static void main (String[] args){
        System.out.println("Perkalian 2");
        for(int i = 1; i <= 10; i++){
            //for(int j = 1; j <= 10; j++){
                System.out.println("2 * " + i + " = " + i*2);
            //}
        }
        
        System.out.println();
        System.out.println("Pangkat 2");
        for(int i=1; i<=10; i++){
            System.out.println(i + "^2 = " + Math.pow(i, 2));
        } 

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Pangkat 1-10");
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.println(j + "^" + i + " = " + Math.pow(j, i));
            }
            System.out.println();
        } 
        System.out.println("-------------------------------------------------------------------");

        

        System.out.println();
        System.out.println("Pesegi");
        for(int j=1; j<=10; j++){
                System.out.print("-");
        }
        System.out.println();
        // for(int i=1; i<=10; i++){
        //     if(i = 1 || i = 10){
        //         System.out.print("|");
                
        //     } else {
        //         System.out.print(" ");
        //     }
        // } 
        System.out.println();
        System.out.println("12345");
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        } 

        System.out.println();
        System.out.println("Pyramid Program");
        int i,j,n1 =5;

        for (i=0; i<n1; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
             
            for (j=0; j<=i; j++) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        }
    }
}
