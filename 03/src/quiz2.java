import java.util.Scanner;
public class quiz2 {
    public static void main(String[] args) throws Exception{
        String kata = "UPHMEDAN20TI2";
        
        String ulang = "y";
        int n = 1;
        // do{
            if(n <= kata.length() && n >= 0){
                int a = kata.length();
                System.out.println(a);
                for(int i = 0; i< a; i++){
                    for(int z = 0; z < i; z++){
                        Character currentString = kata.charAt(z);
                        System.out.print(currentString);
                    }
                    System.out.println();
                } 

                for(int j = a-2; j >= 0; j--){
                    //for(int x = a-)
                    Character currentString = kata.charAt(j);
                    System.out.println(currentString);
                }

            } else {
                // break;
            }
        // } while(ulang.equalsIgnoreCase("y"));

        System.out.println();
    }
}
