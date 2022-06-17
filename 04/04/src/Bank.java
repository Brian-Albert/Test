import java.util.Scanner;
import java.util.ArrayList;
public class Bank {
    public static void ClearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    } 

    public static void cetakMenu(){
        System.out.println("Menu: ");
        System.out.println("1. Transfer Uang");
        System.out.println("2. Cek Mutasi");
        System.out.println("3. Keluar");
        System.out.print("Pilihan Anda (1/2/3) : "); 
    } 

    public static void main(String[] args) throws Exception {
        Nasabah nasabah1 = new Nasabah("Susi", "0213456", 10000000, 0);
        Nasabah nasabah2 = new Nasabah("Budi", "q", 0, 0);
        //0314865
        Scanner input = new Scanner(System.in);
        int menu;
        String ulang = "y";
        int counter = 0;
        int jumlah;
        String nama;
        String rekening;
        ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>();
        int[] mutasi = new int[100];

        do{
            System.out.println("\nNama nasabah           : " + nasabah1.nama); 
            System.out.println("Nomor rekening nasabah : " + nasabah1.rek);
            System.out.println("Saldo nasabah          : " + nasabah1.saldo);
            cetakMenu();
            menu = input.nextInt();
            if(menu == 1){
                do{
                    System.out.print("Nomor rekening yang mau ditransfer ? ");
                    rekening = input.next();
                    if(!rekening.equalsIgnoreCase("0314865")){
                        System.out.println("Maaf no rekening " + rekening + " tidak terdaftar (0314865)");
                    }
                } while(!rekening.equalsIgnoreCase("0314865"));

                if(rekening.equalsIgnoreCase("0314865")){
                    System.out.println("Nama nasabah yang akan ditransfer  : " + nasabah2.nama);
                }
                
                do{
                    System.out.print("Jumlah uang yang akan ditransfer   ? ");
                    nasabah1.jumlah = input.nextInt();
                    if(nasabah1.jumlah > nasabah1.saldo){
                        System.out.println("Maaf saldo anda tidak mencukupi ");
                        System.out.println("Saldo Anda: " + nasabah1.saldo);
                    }
                } while (nasabah1.jumlah > nasabah1.saldo); 

                System.out.println("\nSaldo awal: ");
                System.out.println("Saldo Susi: "+ nasabah1.saldo);
                System.out.println("Saldo Budi: "+ nasabah2.saldo + "\n");
                System.out.println("Memproses transferan....");
                System.out.println("Sedang mentransfer Rp " + nasabah1.jumlah + " ke " + nasabah2.nama + "........");
                System.out.println("Rp "+ nasabah1.jumlah +" yang ditranfer ke "+ nasabah2.nama +" telah BERHASIL\n");

                nasabah1.saldo = nasabah1.saldo - nasabah1.jumlah;
                nasabah2.saldo = nasabah2.saldo + nasabah1.jumlah;

                System.out.println("Saldo setelah transfer: ");
                System.out.println("Saldo Susi: Rp " + nasabah1.saldo);
                System.out.println("Saldo Budi: Rp " + nasabah2.saldo);
                mutasi[counter] = nasabah1.jumlah;
                counter += 1;

            } else if (menu == 2){
                for(int i = 0; i < counter; i++) {
                    System.out.println(i+1 + ". Rp. " + mutasi[i] + " yang Anda transfer ke "+ nasabah2.nama + " telah BERHASIL");
                }

            } else if (menu == 3){
                break;
            } else {
                System.out.println("Maaf anda hanya bisa input dari 1-3");
            } 

            while(ulang == "y"){
                System.out.print("Ulangi? ");
                ulang = input.next();
            }
            
        }while(ulang.equalsIgnoreCase("y"));
        
}
}