//package app.main;
import java.lang.Math;
import java.util.Scanner;
public class BankBeraksi{
    public static void main(String[] args){
        int simpan, ambil;
        Scanner uang = new Scanner(System.in);
        //float rateBunga = (float) 2/100;
        float rateBunga = (float) 272/100;
        rateBunga = Math.round(rateBunga);
        int bungaTabungan; // = rateBunga * saldo akhir
        Bank myBank = new Bank(10000000);
        System.out.println("Saldo awal: IDR. " + myBank.tampilSaldoIDR());

       // myBank.simpanUang(500000);
       System.out.print("Jumlah uang yang disimpan: IDR. ");
       // print tdk ada new line
       // println ada new line
       simpan = uang.nextInt();
       myBank.simpanUang(simpan);
       System.out.println("Simpan Uang IDR. " + simpan);
       System.out.println("Saldo saat ini: " + myBank.tampilSaldoIDR());

       // myBank.ambilUang(150000);// Debug: myBank tetap 60000 karena perintahnya blm dieksekusi. di baris selanjutnya baru dieksekusi
       System.out.print("Jumlah uang yang diambil: IDR. ");
       ambil = uang.nextInt();
       myBank.ambilUang(ambil);
       //System.out.println("Simpan uang Rp 1500000");
       //System.out.println("Saldo saat ini: " + myBank.saldo + "\n");
       System.out.println("Simpan Uang IDR. " + ambil);
       System.out.println("Saldo saat ini: " + myBank.tampilSaldoIDR());
        //Tujuan dibuatnya debug adalah: 
        //utk memastikan bahwa setiap program 
        //yang dibuat sudah berjalan 
        //sebagaimana mestinya. Seperti gimnana 
        //kalian mau merancang program kalian. 
        //bisa saja hasil akhir berbeda dengan yg diinginkan 
        //pasti kalian penasaran salahnya dimana. maka kita bss kasih simulasi 
        //mis: ada development dan testing. di dalam testing ada test case 
        //bungaTabungan = rateBunga * myBank.saldo; // error karena rate bunga bertipe float dikali saldo yang beripe int. dan bungaTabungan bertipe int 
        // bungaTabungan = (int) (rateBunga * myBank.saldo); //bnr
        // int bukuTabunganinc;
        // bukuTabunganinc = bungaTabungan++;
        // System.out.println("Bunga Tabungan: " + bungaTabungan + "\n");
        // //Jika user sudah memiliki akun && User sudah logi, maka
        // // user dapat mengambil / menyimpan uang 
        // Boolean isakun = true;
        // Boolean islogin = true; 
        // if(isakun && islogin){
        //     Boolean akses = true;
        //     myBank.ambilUang(150);
        // }
        // A/B = 3/0 3/null 3/a = Error

        //konvert String to bilangan
        System.out.println();
        String op = "1236";
        double op2 = Double.parseDouble(op);
        Integer.parseInt(op);
        Float.parseFloat(op);
        System.out.println(op2);
        double w = op2 + 2;
        System.out.println(w);

        // //Argumen utk memberi input
        // double alas = Double.parseDouble(args[0]);
        // double tinggi = Double.parseDouble(args[1]);
        // double luas = (alas * tinggi)/2;
        // System.out.println("Luas Segitiga : " + luas); 
        
        // //Konversi bilangan ke string 
        // double ab = 1.2345;
        // int ac = 1000;
        // float ad = (float) 0.5;
        // System.out.println(Double.toString(ab));
        // System.out.println(Integer.toString(ac));
        // System.out.println(Float.toString(ad));
        
        //SubString
        System.out.println();
        System.out.println("Sub String");
        String greeting = "Hello, World!!!";
        String sub = greeting.substring(0,5); //sub is "Hello";
        System.out.println(sub);
        String sub2 = greeting.substring(7, 12); // sub2 is "World";
        System.out.println(sub2);

        //For 
        System.out.println();
        System.out.println("For");
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        //45
        //For Array
        System.out.println();
        System.out.println("For Array");
        int[] numbers = {1,2,3,4,5,6,7,8,10};

        for(int i: numbers){
            System.out.println(i);
        }

        //While
        System.out.println();
        System.out.println("While");
        int k = 1;
        while(k < 11){
            System.out.println(k);
            k++;
        }

        //do...while
        System.out.println();
        System.out.println("DO...While");
        int l = 1;
        do{
            System.out.println(l);
            l++;
        } while (l<11);

        //Return
        System.out.println();
        System.out.println("Return");
        // int perkalian(int x, int y){
        //     return x * y;
        // }
        // void perkalian (int x, int y){
        //     int hsl = x * y;
        //     return;
        // } 

        //Break tidak berlabel
        System.out.println();
        System.out.println("Break tidak berlabel");
        for(int i=0; i<11; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        } 

        //Break berlabel
        System.out.println();
        System.out.println("Break berlabel");
        selesai: 
        for(int i=0; i<11; i++){
            if(i == 5){
                break selesai;
            }
            System.out.println(i);
        }  

        //Continue
        System.out.println();
        System.out.println("Continue");
        

        
    }
}