package BangunRuang2;
public class Bola {
    public final float PI = 22.0f/7;
    public int r = 0;
    public float volume = 0.0f;

    public void volumeBola(){
        volume = 4 * PI * r * r * r / 3; 
        System.out.println("Volume Bola (Jari-jari: "+ r +" cm) = "+ volume +" cm3\n");
    } 

    
}
