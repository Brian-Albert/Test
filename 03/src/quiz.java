import java.util.Scanner;
public class quiz {
    /*
        Nama : Ricky
        Studentid : 09121212
    */
    public static void main(String[] args) throws Exception {
       String kata ="UPHMEDAN20TI2";
       int n=5;
       String yn="y";

       Scanner masukan = new Scanner(System.in);

       do{
       
        System.out.print("Input N :");
        n= masukan.nextInt();
        if(n>kata.length()){
            System.out.println("Error n > panjang kata");
        }
        else{
             for(int i=0;i<=n-1;i++){
                 for(int j=0;j<=i;j++)
                 {System.out.print(kata.substring(j, j+1));}
                 System.out.println("");
             }
     
             for(int i=n-2;i>=0;i--){
                 for(int j=0;j<=i;j++)
                     {System.out.print(kata.substring(j, j+1));}
                 System.out.println("");
             }
 
        }    

        System.out.print("Lanjut? (Y/N)");
        masukan.nextLine();
        yn= masukan.nextLine();
       }while(yn.equals("y"));
       
       
    }
}