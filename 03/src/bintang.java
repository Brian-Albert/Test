import java.util.Arrays;

public class bintang {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //aplikasi untuk mencetak bil genap dari 1 -20
        //ulang2 bilangan dari 1 -20 1,2,3,4,5,6,7,8-20
        for(int i=1;i<=50;i++){
            // modulus %, i (bilangan) % 2 = 0 Genap. i % 2 =1 Ganjil
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        int[] numbers = {10,5,7,9,6,55,23,101};
        //membandingkan setiap angka < bubble sort?
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");

         //aplikasi untuk mencetak bil ganjil dari 1 -20
        //ulang2 bilangan dari 20 -1 1,2,3,4,5,6,7,8-20
        int x=20;
        while(x>0){ //kalau x<=0 hentikan
             // modulus %, i (bilangan) % 2 = 0 Genap. i % 2 =1 Ganjil
            
             //jika ketemu angka 3, lanjutkan perulangan abaikan perintah setelahnya
             if(x==3) {
                 x-=1;
                 continue;
            }

             System.out.print(x + " " + ((x%2==1) ? " Ganjil " : " Genap "));
             
            // if(x%2==1){
            //     System.out.print(x + " ");
            // }
            x-=1; // x-=1; x=x-1; x--;
        }
        System.out.println("");


         //aplikasi untuk mencetak bil ganjil dari 1 -20
        //ulang2 bilangan dari 20 -1 1,2,3,4,5,6,7,8-20
        int y=4;
        do{ //kalau x<=0 hentikan
             // modulus %, i (bilangan) % 2 = 0 Genap. i % 2 =1 Ganjil
             System.out.print(y + " " + ((y%2==1) ? " Ganjil " : " Genap "));

             // if(y%2==1){
            //     System.out.print(y + " ");
            // }
            y-=1; // x-=1; x=x-1; x--;
        }while(y>0);
        System.out.println("");
        
        /*
            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *

            a=5
            =a
            1
            12
            123
            1234
            12345
            <a a=>1
            1234
            123
            12
            1
         */
        int a=10;
        for(int i=1;i<=a;i++){
            // for(int j=1;j<=i;j++){
            //     System.out.print("*");
            // }
            cetakBintang(1, i);
            System.out.print("\n");
        }
        for(int j=a-1;j>=1;j--){
            // for(int i=1;i<=j;i++){
            //     System.out.print("*");
            // }
            cetakBintang(1, j);
            System.out.print("\n");
        }
    }

    public static void cetakBintang(int i, int j){
        System.out.print("*");
        i+=1;
        if(i<=j){
            cetakBintang(i, j);
        }
    }
}