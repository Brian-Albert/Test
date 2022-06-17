//package app.main;
public class GenapGanjil {
    public static void main(String[] args) throws Exception {
        
        int n=9;
        for(int i =1;i<=n;i++){
            //jika genap adalah bilangan yang habis jika dibagi 2 maka cetak
            for(int j=1;j<=i;j++){
            if(j%2==0)
                System.out.print(j+",");
            }
            System.out.println();
        }
        for(int i =n;i>=1;i--){
            //jika genap adalah bilangan yang habis jika dibagi 2 maka cetak
            for(int j=1;j<=i;j++){
            if(j%2==0)
                System.out.print(j+",");
            }
            System.out.println();
        }
        System.out.println();
    }
}