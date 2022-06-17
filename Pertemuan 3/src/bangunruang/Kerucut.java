package bangunruang;

public class Kerucut {
    public final float PI = 22.0f/7; 
    public float volume = 0; 

    public void volumeKerucut (int r, int t) {
        volume =  PI * r * r * t / 3 ; 
        System.out.println("Rumus Volume Kerucut = π x r^2 x t / 3");
        System.out.println("Volume Kerucut = "+ volume +" cm^3");
    }
}
