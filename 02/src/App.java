//package app.main;
//
import java.lang.Math;
//java doc java.math
//import app.main.titik; //domain. uph.edu = edu.uph.[nama aplikasi / nama kategori].[nama app].[module]. = standard company 
//import titik; 
//47 28 
public class App {
    public static void main(String[] args) throws Exception {
        // public int umur = 10; //pendeklarasian variable secara global 
        float a = 10/3;
        System.out.println(Math.abs(a));
        titik b = new titik(); //titik = tipe data yang adalah class yang kita bikin sendiri 
        b.tampil();
        //int nilai1; //pendeklarasian variable tanpa inisialisasi
        //int nilai2 = 10; //pendeklarasian variable dengan inisialisasi
        //int nilai3, nilai4, nilai5; //pendeklarasian banyak variable tanpa inisialisasi
        // tampil();
        b.getX();//error
        //b.para_umur;//gk error, karena di para_umur sifatnya final dan saya gk deklarasikan modifiernya. kalo modifier gk dideklarasiin. seharsunya public. public artinya bisa diakses oleh siapa saja
    }

    // public static void tampil(){ //prosedur, tdk mengembalikan nilai sama sekali
    //     System.out.println("Selamat Datang");
    // } 
}
