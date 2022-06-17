// import java.util.Scanner;
// import java.util.ArrayList;
// import java.lang.annotation.*;
// public class App {
//     public int kasihUang(int jumlah, int saldo){
//         saldo = saldo - jumlah;
//         return saldo;
//     } 
//     public int terimaUang(int jumlah, int saldo){
//         jumlah = saldo + jumlah;
//         return jumlah;
//     }
//     public static void main(String[] args) throws Exception {
//         Nasabah nasabah1 = new Nasabah("Susi", "1234567", 1000000, 0);
//         Nasabah nasabah2 = new Nasabah("Budi", "7654321", 0, 0);
//        Scanner keyboard = new Scanner(System.in);
//        int opsi;
//        String yn = "y";
//        int counter = 0;
//        ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>();
//        do{
//         System.out.println("Menu: ");
//         System.out.println("1. Transfer Uang");
//         System.out.println("2. Cek Mutasi");
//         System.out.println("3. Keluar");
//         System.out.print("Pilihan Anda (1/2/3) : "); 
//         opsi = keyboard.nextInt();
//         if(opsi == 1){
//             System.out.print("Nomor rekening? ");
//             String rekening = keyboard.next();
//             System.out.print("Nama? ");
//             String nama = keyboard.next();
//             if(!nama.equalsIgnoreCase("Budi")){
//                 System.out.println("Nama nasabah tidak terdaftar");
//             }
//             System.out.print("Jumlah? ");
//             int jumlah = keyboard.nextInt();
//             if(jumlah > 1000000){
//                 System.out.println("Saldomu tidak mencukupi ");
//             }
//             nasabah1.kasihUang(jumlah, nasabah1.saldo);
//             nasabah2.terimaUang(jumlah, nasabah2.saldo);
//             System.out.println("Memproses transfer....");
//             System.out.println("Saldo Susi: Rp " + nasabah1.saldo);
//             System.out.println("Saldo Budi: Rp " + nasabah2.saldo);
//             counter += 1;
//         } else if (opsi == 2){
//             if(counter > 0){
//                 for(int i=1; i<= counter; i++){
//                     nasabah.add(new Nasabah(nasabah2.nama, nasabah2.rek, nasabah1.saldo, nasabah1.jumlah));
//                     System.out.println("Transfer ke-" + i + " telah berhasil");
//                 }
//                 System.out.println();
//             } else {
//                 System.out.println("Tidak ada data");
//             }
//         } else if (opsi == 3){
//             break;
//         } else {
//             System.out.println("Kamu hanya bisa input dari 1-3");
//         }    
//             System.out.print("Mengulang program? ");
//             yn = keyboard.next();
//        }while(yn.equalsIgnoreCase("y"));
       
       
// }
// }