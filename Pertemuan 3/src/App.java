
import bangunruang.*;
import java.util.Scanner;

public class App {
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) throws Exception {
        String yn = "y"; 
        Scanner keyboard = new Scanner(System.in);

        while(yn.equalsIgnoreCase("y")){

            clearScreen();
            int pilihan = 0;
            
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
            pilihan = keyboard.nextInt();

            System.out.println("");
            if(pilihan==1){
                Bola bola = new Bola();
                System.out.print("Masukkan jari-jari bola (cm): ");
                int x = keyboard.nextInt();
                bola.volumeBola(x);
            }
            else if(pilihan==2){
                Kerucut kerucut = new Kerucut();
                System.out.print("Masukkan jari-jari kerucut (cm): ");
                int x = keyboard.nextInt();
                System.out.print("Masukkan tinggi kerucut (cm): ");
                int y = keyboard.nextInt();
                kerucut.volumeKerucut(x,y);
            }
            else if(pilihan==3){
                LimasSegiempat limasSegiempat = new LimasSegiempat();
                System.out.print("Masukkan sisi alas limas segiempat (cm): ");
                int x = keyboard.nextInt();
                System.out.print("Masukkan tinggi limas segiempat (cm): ");
                int y = keyboard.nextInt();
                limasSegiempat.volumeLimasSegiempat(x,y);
            }
            else if(pilihan==4){
                Tabung tabung = new Tabung();
                System.out.print("Masukkan jari-jari tabung (cm): ");
                int x = keyboard.nextInt();
                System.out.print("Masukkan tinggi tabung (cm): ");
                int y = keyboard.nextInt();
                tabung.volumeTabung(x,y);
            }
            else if(pilihan==5){
                Trapesium trapesium = new Trapesium();
                System.out.print("Masukkan panjang alas trapesium (cm): ");
                int x = keyboard.nextInt();
                System.out.print("Masukkan panjang bubung trapesium (cm): ");
                int y = keyboard.nextInt();
                System.out.print("Masukkan tinggi trapesium (cm): ");
                int z = keyboard.nextInt();
                trapesium.luasTrapesium(x,y,z);
            }
            else if(pilihan==6){
                break;
            }
            else{
                System.out.println("Pilihan tidak tersedia");
            }

            System.out.print("\nApakah Anda ingin kembali ke menu utama (y/n) ? ");
            yn = keyboard.next();
        }
        System.out.println("");
        keyboard.close();
    }
}
