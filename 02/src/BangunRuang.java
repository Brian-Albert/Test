//package app.main;
import java.lang.Math;
import java.util.Scanner;

public class BangunRuang {
    public static void main (String [] args){
        System.out.println("Menu:");
        System.out.println("1. Persegi");
        System.out.println("2. Kubus");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Balok");
        System.out.println("5. Segitiga siku-siku");
        System.out.println("6. Trapesium");
        System.out.println("7. Lingkaran");
        int menu;
        Scanner inputMenu = new Scanner(System.in);
        System.out.print("Menu: ");
        menu = inputMenu.nextInt();
        if(menu == 1){
            System.out.println("Menu: Persegi");
            int sisi,luas;
            Scanner inputUkuran = new Scanner(System.in);
            System.out.print("Sisi: ");
            sisi = inputUkuran.nextInt();
            System.out.println("Luas Persegi: " + sisi + " x " + sisi);
            luas = sisi * sisi;
            System.out.println("Luas Persegi: " + luas);
        } else if (menu == 2 ){
            System.out.println("Menu: Balok");
            int panjang, lebar, tinggi, luas, volume;
            Scanner inputUkuran = new Scanner(System.in);
            System.out.print("Panjang: ");
            panjang = inputUkuran.nextInt();
            System.out.print("Lebar: ");
            lebar = inputUkuran.nextInt();
            System.out.print("Tinggi: ");
            tinggi = inputUkuran.nextInt();
            //L = 2 × (pl + pt + lt)
            System.out.println("Luas Balok: 2 x (" + panjang + " x " + lebar + " + " + panjang + " x " + tinggi + " + " + lebar + " x " + tinggi + ")" );
            luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
            System.out.println("Luas Balok: " + luas);
            System.out.println("Volume Balok: " + panjang + " x " + lebar + " x " + tinggi);
            volume = panjang * lebar * tinggi;
            System.out.println("Volume Balok: " + volume);
        } else if (menu == 6){
            System.out.println("Menu: Balok");
            int panjangSisi1, panjangSisi2, tinggi, luas;
            Scanner inputUkuran = new Scanner(System.in);
            System.out.print("Panjang Sisi Sejajar 1: ");
            panjangSisi1 = inputUkuran.nextInt();
            System.out.print("Panjang Sisi Sejajar 2: ");
            panjangSisi2 = inputUkuran.nextInt();
            System.out.print("Tinggi: ");
            tinggi = inputUkuran.nextInt();
            // ½ x (5 + 9) x 3
            System.out.println("Luas Trapesium: ½ x (" + panjangSisi1 + " + " + panjangSisi2 + ") x " + tinggi );
            //final float setengah = (float) 0.5;
            luas = ((panjangSisi1 + panjangSisi2) * tinggi)/2;
            System.out.println("Luas Trapesium: " + luas);
        }
            

    }
}