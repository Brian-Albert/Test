import java.lang.management.MemoryUsage;
import java.util.Arrays;
import java.util.Scanner;
import BangunRuang2.*;

public class App {
    public static void ClearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    } 

    public static void menuBola(Scanner input){
        Bola ball = new Bola();
        System.out.print("Masukkan panjang jari-jari Bola (cm): ");
        ball.r = input.nextInt();
        ball.volumeBola();
    }  
    public static void menuTabung(Scanner input){
        Tabung tube = new Tabung();
        System.out.print("Masukkan Panjang jari-jari Tabung (cm): ");
        tube.r = input.nextInt();
        System.out.print("Masukkan Tinggi Tabung (cm): ");
        tube.t = input.nextInt(); 
        tube.VolumeTabung();       
    }

    public static void cetakMenu(){
        System.out.println("---------------------");
            System.out.println("Aplikasi Bangun Ruang");
            System.out.println("---------------------");
            System.out.println("1. Bola");
            System.out.println("2. Kerucut");
            System.out.println("3. Limas Segiempat");
            System.out.println("4. Tabung");
            System.out.println("5. Trapesium");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda (1/2/3/4/5/6) : "); 
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        String ulang = "y";
        while(ulang.equalsIgnoreCase("y")){
            ClearScreen();
            cetakMenu();
            int menu = input.nextInt();
            if(menu == 1){
                menuBola(input);
            } else if (menu == 2){
                
            } else if (menu == 3){

            } else if (menu == 4){
                menuTabung(input);
            }

            System.out.print("Ulangi? ");
            ulang = input.next();
            ClearScreen();
        }
    }

    }

 