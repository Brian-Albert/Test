package bangunruang;

public class Tabung {
    public final float PI = 22.0f/7;
    public float volume = 0;
    
    public void volumeTabung(int r, int t){
        volume = PI * (r*r) * t;
        System.out.println("Rumus Volume Tabung = π x r^2 x t");
        System.out.println("Volume Tabung = " + volume + " cm^3");
    } 
}