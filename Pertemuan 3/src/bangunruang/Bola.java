package bangunruang;

public class Bola {
    public final float PI = 22.0f/7;
    public float volume = 0;

    public void volumeBola(int r){
        volume = 4 * PI * r * r * r / 3;
        System.out.println("Rumus Volume Bola = 4/3 x π x r^3");
        System.out.println("Volume Bola = "+ volume +" cm^3");
    }
}
