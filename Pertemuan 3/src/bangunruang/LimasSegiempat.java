package bangunruang;

public class LimasSegiempat {
    public int Volume = 0;
    
    public void volumeLimasSegiempat(int s, int t) {
        Volume = s * s * t;
        System.out.println("Rumus Volume Limas Segiempat = s x s x t");
        System.out.println("Volume dari Limas Segiempat = " + Volume + " cm^3");
    }
}
