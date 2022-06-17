import java.util.Scanner;

public class Trapesium {
    public static void hitungLuasTrapesium(int rusuk1, int rusuk2, int tinggi) {
    int luas;
    luas= (rusuk1+rusuk2)/2*tinggi ;
    System.out.println("Luas Trapesium (dengan rusuk 1: "+ rusuk1 +"cm , rusuk 2: "+rusuk2+"cm dan tinggi: "+tinggi+"cm) = "+ luas + "cm2");   
    } 
    
    public static void main(String[] args) throws Exception {
        System.out.println("Menghitung Luas Trapesium ");
        System.out.println("==========================");
        Scanner input = new Scanner(System.in);
        int rusuk1, rusuk2, tinggi;
        System.out.print("Masukkan Rusuk Pendek     = ");
        rusuk1 = input.nextInt();
        System.out.print("Masukkan Rusuk Panjang    = ");
        rusuk2 = input.nextInt();
        System.out.print("Masukkan Tinggi Trapesium = ");
        tinggi = input.nextInt();
        hitungLuasTrapesium(rusuk1,rusuk2,tinggi);
        
    }  
}