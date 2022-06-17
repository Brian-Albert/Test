//package app.main;
public class Balok {
    
    public int v = 0;
    public int p = 0;
    public int l = 0;
    public int t = 0;

    public void caraVolumeBalok(){
        v = p*l*t;
    }

    public void showVolumeBalok(){
        System.out.println("Volume Balok dengan panjang("+p+"), lebar ("+l+"), tinggi("+t+") adalah "+v+" cm3");
    }

}