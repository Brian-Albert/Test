package BangunRuang2;
//import java.util.Scanner;
    
public class Tabung {
    public final float PI = 22.0f/7;
    public float v = 0.0f;
    public int r = 0;
    public int t = 0;


    public void VolumeTabung(){
        //Volume Tabung = π r2 t
        v = PI * (r*r) * t;
        System.out.println("Menghitung Volume Tabung:");
        System.out.println("Panjang Jari-jari Tabung = " + r + " cm");
        System.out.println("Tinggi Tabung = " +  t + " cm");
        System.out.println("Rumus: Volume Tabung = π x r^2 x t");
        System.out.println("Rumus: Volume Tabung = " + PI + " x " + r + "^2 x " + t );
        System.out.println("Volume Tabung = " + v + " cm^3");
    } 
}
