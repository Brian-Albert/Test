//Nama : Brian Albert
//NIM  : 03081210027
//Kelas: 21SI2
//Kelompok 1
//package app.main;
import java.util.Scanner;

public class Tabung2 {
    
    public static void hitungVolumeTabung(int r, int t){
        //Volume Tabung = π r2 t
        double v = 0.0;
        final float PI = 22.0f/7;
        v = PI * (Math.pow(r, 2)) * t;
        System.out.println("Menghitung Volume Tabung:");
        System.out.println("Panjang Jari-jari Tabung = " + r + " cm");
        System.out.println("Tinggi Tabung = " +  t + " cm");
        System.out.println("Rumus: Volume Tabung = π x r^2 x t");
        System.out.println("Rumus: Volume Tabung = " + PI + " x " + r + "^2 x " + t );
        System.out.println("Volume Tabung = " + v + " cm^3");
    } 
    public static void hitungLuasPermukaanTabung(int r, int t){
        double luas = 0.0;
        final float PI = 22.0f/7;
        //Luas = 2 * π * r * (r + t)
        luas = 2 * PI * r * (r + t);
        System.out.println("Rumus: Luas Permukaan Tabung = 2πr * (r + t)");
        System.out.println("Rumus: Luas Permukaan Tabung = 2 * " + PI + " x " + r + " x ("+ r + " + " + t + ")" );
        System.out.println("Luas Permukaan Tabung = " + luas + " cm^2");
    }
    public static void main(String[] args) throws Exception {
        int r, t;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang jari-jari Tabung (cm) : ");
        r = input.nextInt();
        System.out.print("Masukkan Tinggi Tabung (cm) : ");
        t = input.nextInt();
        System.out.println();
        hitungVolumeTabung(r,t);
        System.out.println();
        hitungLuasPermukaanTabung(r, t);
    }
}