//package app.main;
import java.util.Scanner;
public class Kerucut {
    public static void main (String[] args){
        //atribut
        final float PI = 22.0f/7 ; 
        int r;
        int s;
        int t;
        float luas;
        float volume;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Jari-jari kerucut? ");
        r = keyboard.nextInt();
        System.out.print("s? ");
        s = keyboard.nextInt();
        luas = 0; 
        System.out.print("Tinggi kerucut? ");
        t = keyboard.nextInt();
        volume = 0; 
        luas = PI * r *(r + s);
        volume = (PI *(r * r) * t)/3; 
        System.out.println("Luas Kerucut = "+ luas + "cm2");
        System.out.println("Volume Kerucut = "+ volume + "cm3");
    }
}